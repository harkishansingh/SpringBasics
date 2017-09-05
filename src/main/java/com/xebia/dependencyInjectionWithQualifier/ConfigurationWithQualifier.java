package com.xebia.dependencyInjectionWithQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class ConfigurationWithQualifier {

	@Bean

	public IServiceWithQualifier getDBService() {
		return new DBServiceWithQualifier();
	}

	@Bean
	public DBHelperWithQualifier getDBHelper(@Qualifier("DBService") IServiceWithQualifier dbservice) {
		return new DBHelperWithQualifier(dbservice);
	}

	@Bean

	public IServiceWithQualifier getGraphDBService() {
		return new GraphDBServiceWithQualifier();
	}
}
