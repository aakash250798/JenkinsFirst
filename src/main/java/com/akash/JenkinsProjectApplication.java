package com.akash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication implements CommandLineRunner {
	
	public static final Logger logger=LoggerFactory.getLogger(JenkinsProjectApplication.class); 
	
	public static void main(String[] args) {
		logger.info("its a continuous integeration job");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Its my 2nd logger");
		
	}
}
