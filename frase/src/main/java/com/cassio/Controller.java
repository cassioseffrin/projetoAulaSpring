package com.cassio;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

//
//	 "SUJEITO" "VERBO"  "ARTIGO"   "SUBSTANTIVO"  "ADJETIVO"
//	 
	
	@Autowired
	DiscoveryClient clientes;
	

	@GetMapping("/frase")
	public @ResponseBody String getFrase() {
		return getFracaoFrase("SUJEITO") + " " + getFracaoFrase("VERBO")+  " " + getFracaoFrase("ARTIGO") + " "
				+ getFracaoFrase("SUBSTANTIVO") + " " + getFracaoFrase("ADJETIVO") + ".";
	}

	public String getFracaoFrase(String microServico) {
		List<ServiceInstance> instanciaServico = clientes.getInstances(microServico);
		if (instanciaServico != null && instanciaServico.size() > 0) {
			URI uri = instanciaServico.get(0).getUri();
			if (uri != null) {
				return (new RestTemplate()).getForObject(uri, String.class);
			}
		}
		return null;
	}

}
