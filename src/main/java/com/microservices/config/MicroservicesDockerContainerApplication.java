package com.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.microservices.controller")
public class MicroservicesDockerContainerApplication {
    //example
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDockerContainerApplication.class, args);
	}
}
