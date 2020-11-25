package com.lec.sts13_jdbc.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lec.sts13_jdbc.Controller;

@Configuration
public class LoggerConfig {

	@Bean
	public Logger logger() {
		return LoggerFactory.getLogger(Controller.class);
	}
	
}
