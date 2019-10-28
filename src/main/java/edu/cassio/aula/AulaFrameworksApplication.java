package edu.cassio.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"teste","edu.cassio.aula.controllers"})
@SpringBootApplication
public class AulaFrameworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaFrameworksApplication.class, args);
	}

}
