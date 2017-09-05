package com.xebia.dependencyInjectionWithResourceAnnotation;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBHelperWithResourceAnnotation {
	public static Logger LOGGER = LoggerFactory.getLogger(DBServiceWithResourceAnnotation.class);

	private IServiceWithResourceAnnotation dbservice;

	@Resource(name = "DBService")
	public void setIServiceWithResourceAnnotation(IServiceWithResourceAnnotation dbservice) {
		this.dbservice = dbservice;
	}

	public void heplTosaveData(String data) {
		LOGGER.info("I'm in heplTosaveData method");
		dbservice.saveData(data);
		LOGGER.info("Bean Name: {}", dbservice.getName());
	}
}
