package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger=LoggerFactory.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("Application Started ...");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed buddy......");
		System.out.println("Let s check when its running ");
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
