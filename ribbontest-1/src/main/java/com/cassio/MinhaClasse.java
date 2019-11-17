package com.cassio;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

public class MinhaClasse {
	@Autowired
	LoadBalancerClient loadBalancer;

	public void algumMetodo() {
		ServiceInstance instance = loadBalancer.choose("subject");
		URI subjectUri = URI.create(String.format("http://%s:%s", 
				instance.getHost(), instance.getPort()));
		// ...fazer o chamda 
	}
}
