package com.xebia.importResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
@ImportResource("classpath:properties-config.xml")
public class AppConfig {
	public static Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	@Bean
	@Profile("production")
	public DataSource dataSource() {
		LOGGER.info("Params for dataSource: url: {} username: {} password: {}", url, username, password);
		return new DataSource(url, username, password);
	}

}
