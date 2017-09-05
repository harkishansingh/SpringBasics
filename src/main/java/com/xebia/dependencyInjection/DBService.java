package com.xebia.dependencyInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBService implements IService {
	public static Logger LOGGER = LoggerFactory.getLogger(DBService.class);

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
