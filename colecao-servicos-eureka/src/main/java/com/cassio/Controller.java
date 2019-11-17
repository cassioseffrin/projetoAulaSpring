package com.cassio;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	DiscoveryClient clientes;
	@GetMapping("/servicos")
	public @ResponseBody String  getURI() {
		List<ServiceInstance> lstRecursosDaInstancia = clientes.getInstances("AULA");
		if (lstRecursosDaInstancia != null && lstRecursosDaInstancia.size() > 0) {
			ServiceInstance serviceInstance = lstRecursosDaInstancia.get(0);
			return serviceInstance.getUri().toString();
		}
		return "servico nao encontrado";
	}

}
