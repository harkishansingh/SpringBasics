package com.xebia.dependencyInjectionWithMultipleType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class ConfigurationWithMultipleType {

	@Bean
	public IServiceWithMultipleType getDBService() {
		return new DBServiceWithMultipleType();
	}

	@Bean
	public DBHelperWithMultipleType getDBHelper(IServiceWithMultipleType dbservice) {
		return new DBHelperWithMultipleType(dbservice);
	}

	@Bean
	@Primary
	public IServiceWithMultipleType getGraphDBService() {
		return new GraphDBServiceWithMultipleType();
	}

}
