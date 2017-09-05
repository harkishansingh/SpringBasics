package com.xebia.dependencyInjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DBHelper {
	public static Logger LOGGER = LoggerFactory.getLogger(DBService.class);

	private IService dbservice;

	@Autowired
	public DBHelper(IService dbservice) {
		super();
		this.dbservice = dbservice;
	}

	public void heplTosaveData(String data) {
		LOGGER.info("I'm in heplTosaveData method");
		dbservice.saveData(data);
		LOGGER.info("Bean Name: {}", dbservice.getName());

	}
}
