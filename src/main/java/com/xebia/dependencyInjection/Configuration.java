package com.xebia.dependencyInjection;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public IService getDBService() {
		return new DBService();
	}

	@Bean
	public DBHelper getDBHelper(IService dbservice) {
		return new DBHelper(dbservice);
	}

}
