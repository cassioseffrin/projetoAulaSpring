package com.cassio.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "substantivo")
public interface SubstantivoClient {
	@GetMapping("/")
	public String getSubstantivo();

}
