package com.xebia.dependencyInjectionWithQualifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="GraphDBService")
public class GraphDBServiceWithQualifier implements IServiceWithQualifier{
	public static Logger LOGGER = LoggerFactory.getLogger(GraphDBServiceWithQualifier.class);

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
