package com.xebia.messageSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMessageSource {
	public static Logger LOGGER = LoggerFactory.getLogger(MainMessageSource.class);

	public static void main(String[] args) {
		LOGGER.info("I'm in main method");
		@SuppressWarnings("resource")
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigMessageSource.class);
		context.registerShutdownHook();
		MessageSource resources = (MessageSource) context.getBean(MessageSource.class);
		String username = resources.getMessage("jdbc.username", null, "Default", null);
		LOGGER.info("Username: {}", username);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}
		});
	}
}
