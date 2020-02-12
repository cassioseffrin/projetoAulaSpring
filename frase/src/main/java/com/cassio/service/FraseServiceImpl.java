package com.cassio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassio.feign.AdjetivoClient;
import com.cassio.feign.ArtigoClient;
import com.cassio.feign.SubstantivoClient;
import com.cassio.feign.SujeitoClient;
import com.cassio.feign.VerboClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FraseServiceImpl implements FraseService {

	@Autowired
	private AdjetivoClient adjetivoClient;
	@Autowired
	private ArtigoClient artigoClient;
	@Autowired
	private SubstantivoClient substantivoClient;
	@Autowired
	private SujeitoClient sujeitoClient;
	@Autowired
	private VerboClient verboClient;

	@Override
	public String getSujeito() {
		return sujeitoClient.getSujeito();
	}

	@Override
	public String getVerbo() {
		return verboClient.getVerbo();
	}

	@Override
	public String getArtigo() {
		return artigoClient.getArtigo();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getFallbackAdjetivo")
	public String getAdjetivo() {
		return adjetivoClient.getAdjetivo();
	}

	public String getFallbackAdjetivo() {
		return (" BONITA FALLBACK ");
	}

	@Override
	public String getSubstantivo() {
		return substantivoClient.getSubstantivo();
	}
}