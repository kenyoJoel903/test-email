package com.mining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestEmailApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestEmailApplication.class);
	


	public static void main(String[] args) {
		SpringApplication.run(TestEmailApplication.class, args);
	}
	
	
	
	

}
