package com.cassio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;

@Configuration
public class AulaConfig {
	@Bean
	public IPing ribbonPing(IClientConfig config) {
		return new PingUrl();
	}
}
