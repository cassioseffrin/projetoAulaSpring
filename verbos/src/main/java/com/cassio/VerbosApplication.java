package com.cassio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VerbosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerbosApplication.class, args);
	}

}
