package com.cassio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cassio.feign.AdjetivoClient;
import com.cassio.feign.ArtigoClient;
import com.cassio.feign.SubstantivoClient;
import com.cassio.feign.SujeitoClient;
import com.cassio.feign.VerboClient;
import com.cassio.service.FraseServiceImpl;

@RestController
public class Controller {

	@Autowired
	RestTemplate template;

//	@Autowired
//	private AdjetivoClient adjetivoClient;
//	@Autowired
//	private ArtigoClient artigoClient;
//	@Autowired
//	private SubstantivoClient substantivoClient;
//	@Autowired
//	private SujeitoClient sujeitoClient;
//	@Autowired
//	private VerboClient verboClient;
	@Autowired FraseServiceImpl fraseService;

//	@GetMapping("/frase")
//	public @ResponseBody String getFrase() {
//		return getFracaoFrase("SUJEITO") + " " + getFracaoFrase("VERBO") + " " + getFracaoFrase("ARTIGO") + " "
//				+ getFracaoFrase("SUBSTANTIVO") + " " + getFracaoFrase("ADJETIVO") + ".";
//	}

	@GetMapping("/frase")
	public @ResponseBody String getFrase() {
		return fraseService.getSujeito() + " " + fraseService.getVerbo() + " " + fraseService.getArtigo() + " "
				+ fraseService.getSubstantivo() + " " + fraseService.getAdjetivo() + ".";
	}

	public String getFracaoFrase(String microServico) {
		return template.getForObject("http://" + microServico, String.class);
	}

}

////modelo sem ribbon
//	@Autowired
//	DiscoveryClient clientes;
//	public String getFracaoFrase(String microServico) {
//	List<ServiceInstance> instanciaServico = clientes.getInstances(microServico);
//	if (instanciaServico != null && instanciaServico.size() > 0) {
//		URI uri = instanciaServico.get(0).getUri();
//		if (uri != null) {
//			return (new RestTemplate()).getForObject(uri, String.class);
//		}
//	}
//	return null;
//}
