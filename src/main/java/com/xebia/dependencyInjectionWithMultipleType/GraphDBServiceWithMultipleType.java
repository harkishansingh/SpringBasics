package com.xebia.dependencyInjectionWithMultipleType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphDBServiceWithMultipleType implements IServiceWithMultipleType{
	public static Logger LOGGER = LoggerFactory.getLogger(GraphDBServiceWithMultipleType.class);

	private String name;

	public String getName() {
		return name;
	}

	public void saveData(String data) {
		LOGGER.info("Saving data {} in GraphDBService ", data);
	}
	
	public void setBeanName(String arg0) {
		this.name = arg0;
		
	}
}
