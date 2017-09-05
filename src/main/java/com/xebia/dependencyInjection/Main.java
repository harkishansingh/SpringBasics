package com.xebia.dependencyInjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	public static Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		LOGGER.info("I'm in main method");
		@SuppressWarnings("resource")
		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				Configuration.class);
		context.registerShutdownHook();
		DBHelper dbHelper = (DBHelper) context.getBean(DBHelper.class);
		dbHelper.heplTosaveData("Good morning");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
