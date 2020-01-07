package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("in init method");
		
	}

	public static void main(String[] args) {
		logger.info("pipeline integartion with jenkins");
		logger.info("in tesrt method automatic build testing.........");
		logger.info("in main()........");
		
		logger.info("in main method........");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
