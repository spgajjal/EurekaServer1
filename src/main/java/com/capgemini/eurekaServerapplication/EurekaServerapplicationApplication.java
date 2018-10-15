package com.capgemini.eurekaServerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
  
@EnableEurekaServer 
@SpringBootApplication
public class EurekaServerapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerapplicationApplication.class, args);
	}
}
 