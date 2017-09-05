package com.xebia.dependencyInjectionWithResourceAnnotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainWithResourceAnnotation {
	public static Logger LOGGER = LoggerFactory.getLogger(MainWithResourceAnnotation.class);

	public static void main(String[] args) {
		LOGGER.info("I'm in main method");
		@SuppressWarnings("resource")
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigurationWithResourceAnnotation.class);
		context.registerShutdownHook();
		DBHelperWithResourceAnnotation dbHelper = (DBHelperWithResourceAnnotation) context.getBean(DBHelperWithResourceAnnotation.class);
		dbHelper.heplTosaveData("Good morning");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
