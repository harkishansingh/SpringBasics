package com.xebia.dependencyInjectionWithMultipleType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.xebia.dependencyInjection.DBHelper;

public class MainWithMultipleType {
	public static Logger LOGGER = LoggerFactory.getLogger(MainWithMultipleType.class);

	public static void main(String[] args) {
		LOGGER.info("I'm in main method");
		@SuppressWarnings("resource")
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigurationWithMultipleType.class);
		context.registerShutdownHook();
		DBHelperWithMultipleType dbHelper = (DBHelperWithMultipleType) context.getBean(DBHelperWithMultipleType.class);
		dbHelper.heplTosaveData("Good morning");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
