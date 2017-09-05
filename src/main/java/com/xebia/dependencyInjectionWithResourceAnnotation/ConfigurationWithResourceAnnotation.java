package com.xebia.dependencyInjectionWithResourceAnnotation;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class ConfigurationWithResourceAnnotation {

	@Bean(name="DBService")
	public IServiceWithResourceAnnotation getDBService() {
		return new DBServiceWithResourceAnnotation();
	}

	@Bean
	public DBHelperWithResourceAnnotation getDBHelper() {
		return new DBHelperWithResourceAnnotation();
	}

	

}
