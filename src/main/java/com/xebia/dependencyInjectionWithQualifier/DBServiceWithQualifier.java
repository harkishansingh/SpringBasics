package com.xebia.dependencyInjectionWithQualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;


@Qualifier(value = "DBService")
public class DBServiceWithQualifier implements IServiceWithQualifier {
	public static Logger LOGGER = LoggerFactory.getLogger(DBServiceWithQualifier.class);

	private String name;

	public String getName() {
		return name;
	}

	public void saveData(String data) {
		LOGGER.info("Saving data {} in DBService ", data);
	}

	public void setBeanName(String arg0) {
		this.name = arg0;

	}

	@PostConstruct
	public void init() {
		LOGGER.info("I'm inside init ---> PostConstruct called");
	}

	@PreDestroy
	public void destroy() {
		LOGGER.info("I'm inside destroy ---> @PreDestroy called");
	}

}
