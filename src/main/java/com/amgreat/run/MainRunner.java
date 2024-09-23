package com.amgreat.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan (basePackages = "com.amgreat.mvc.controller, com.amgreat.mvc.services, org.springframework.web.client")
@SpringBootApplication
public class MainRunner {
	public static void main(String[] args) {
		SpringApplication.run(MainRunner.class, args);
	}
}
