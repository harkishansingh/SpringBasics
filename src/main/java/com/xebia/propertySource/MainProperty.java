package com.xebia.propertySource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainProperty {
	public static Logger LOGGER = LoggerFactory.getLogger(MainProperty.class);
	
	public static void main(String[] args) {
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfigPropertyResource.class);
		context.registerShutdownHook();
		AppConfigPropertyResource config = (AppConfigPropertyResource) context.getBean(AppConfigPropertyResource.class);
		TestBean bean = config.testBean();
		LOGGER.info("Params from property file: {}",bean.getName());
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
