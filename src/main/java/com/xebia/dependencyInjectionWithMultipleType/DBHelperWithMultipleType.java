package com.xebia.dependencyInjectionWithMultipleType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DBHelperWithMultipleType {
	public static Logger LOGGER = LoggerFactory.getLogger(DBServiceWithMultipleType.class);

	private IServiceWithMultipleType dbservice;

	@Autowired
	public DBHelperWithMultipleType(IServiceWithMultipleType dbservice) {
		super();
		this.dbservice = dbservice;
	}

	public void heplTosaveData(String data) {
		LOGGER.info("I'm in heplTosaveData method");
		dbservice.saveData(data);
		LOGGER.info("Bean Name: {}", dbservice.getName());
	}
}
