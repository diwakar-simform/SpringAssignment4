package com.spring.SpringAssignment4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAssignment4Application {
	private static Logger logger = LoggerFactory.getLogger(SpringAssignment4Application.class);

	public static void main(String[] args) {
		logger.info("...Spring Application run successfully...");
		SpringApplication.run(SpringAssignment4Application.class, args);
	}

}
