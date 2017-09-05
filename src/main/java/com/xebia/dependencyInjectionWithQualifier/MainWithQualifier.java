package com.xebia.dependencyInjectionWithQualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.xebia.dependencyInjection.DBHelper;

public class MainWithQualifier {
	public static Logger LOGGER = LoggerFactory.getLogger(MainWithQualifier.class);

	public static void main(String[] args) {
		LOGGER.info("I'm in main method");
		@SuppressWarnings("resource")
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigurationWithQualifier.class);
		context.registerShutdownHook();
		DBHelperWithQualifier dbHelper = (DBHelperWithQualifier) context.getBean(DBHelperWithQualifier.class);
		dbHelper.heplTosaveData("Good morning");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
