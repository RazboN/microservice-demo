package com.microservices.drinksservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DrinksServiceApplication {
	public static void main(String[] args) {
		try{
			SpringApplication.run(DrinksServiceApplication.class, args);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
