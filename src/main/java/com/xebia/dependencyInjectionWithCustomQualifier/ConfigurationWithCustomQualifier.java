package com.xebia.dependencyInjectionWithCustomQualifier;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class ConfigurationWithCustomQualifier {

	@Bean	
	@DBQualifier(value = "DBService")
	public IServiceWithCustomQualifier getDBService() {
		return new DBServiceWithCustomQualifier();
	}

	@Bean
	public DBHelperWithCustomQualifier getDBHelper(@DBQualifier("GraphDBService")IServiceWithCustomQualifier dbservice) {
		return new DBHelperWithCustomQualifier(dbservice);
	}

	@Bean	
	@DBQualifier(value = "GraphDBService")
	public IServiceWithCustomQualifier getGraphDBService() {
		return new GraphDBServiceWithCustomQualifier();
	}


}
