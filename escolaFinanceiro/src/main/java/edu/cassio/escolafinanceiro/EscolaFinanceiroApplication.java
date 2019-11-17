package edu.cassio.escolafinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("edu.cassio.escolafinanceiro")
@EnableDiscoveryClient
public class EscolaFinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaFinanceiroApplication.class, args);
	}

}
