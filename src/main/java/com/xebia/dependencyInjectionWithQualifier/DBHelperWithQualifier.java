package com.xebia.dependencyInjectionWithQualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DBHelperWithQualifier {
	public static Logger LOGGER = LoggerFactory.getLogger(DBServiceWithQualifier.class);

	private IServiceWithQualifier dbservice;

	@Autowired
	public DBHelperWithQualifier(IServiceWithQualifier dbservice) {
		super();
		this.dbservice = dbservice;
	}

	public void heplTosaveData(String data) {
		LOGGER.info("I'm in heplTosaveData method");
		dbservice.saveData(data);
		LOGGER.info("Bean Name: {}", dbservice.getName());
	}
}
