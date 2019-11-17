package com.cassio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FraseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraseApplication.class, args);
	}

}
