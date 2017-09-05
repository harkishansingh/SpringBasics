package com.xebia.importResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.xebia.dependencyInjection.Main;

public class MainClass {
	public static Logger LOGGER = LoggerFactory.getLogger(MainClass.class);

	public static void main(String[] args) {
		LOGGER.info("I'm in main method");
		@SuppressWarnings("resource")
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		context.getEnvironment().setActiveProfiles("production");
		context.register(AppConfig.class);
		context.refresh();
		AppConfig config = (AppConfig) context.getBean(AppConfig.class);
		config.dataSource();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
