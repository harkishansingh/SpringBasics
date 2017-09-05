package com.xebia.dependencyInjectionWithCustomQualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.xebia.dependencyInjection.DBHelper;

public class MainWithCustomQualifier {
	public static Logger LOGGER = LoggerFactory.getLogger(MainWithCustomQualifier.class);

	public static void main(String[] args) {
		LOGGER.info("I'm in main method");
		@SuppressWarnings("resource")
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigurationWithCustomQualifier.class);
		context.registerShutdownHook();
		DBHelperWithCustomQualifier dbHelper = (DBHelperWithCustomQualifier) context.getBean(DBHelperWithCustomQualifier.class);
		dbHelper.heplTosaveData("Good morning");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
