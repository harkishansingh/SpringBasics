package com.xebia.propertySource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class AppConfigPropertyResource {
	public static Logger LOGGER = LoggerFactory.getLogger(AppConfigPropertyResource.class);
	
	@Autowired
	Environment env;

	@Value("${jdbc.username}")
    private String username;
	
	@Bean
	public TestBean testBean() {
		LOGGER.info("I'm inside test bean : username: {}",username);
		TestBean testBean = new TestBean();
		testBean.setName(env.getProperty("jdbc.username"));
		return testBean;
	}
}
