package com.xebia.dependencyInjectionWithCustomQualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DBHelperWithCustomQualifier {
	public static Logger LOGGER = LoggerFactory.getLogger(DBServiceWithCustomQualifier.class);

	private IServiceWithCustomQualifier dbservice;

	@Autowired
	public DBHelperWithCustomQualifier(IServiceWithCustomQualifier dbservice) {
		super();
		this.dbservice = dbservice;
	}

	public void heplTosaveData(String data) {
		LOGGER.info("I'm in heplTosaveData method");
		dbservice.saveData(data);
		LOGGER.info("Bean Name: {}", dbservice.getName());
	}
}
