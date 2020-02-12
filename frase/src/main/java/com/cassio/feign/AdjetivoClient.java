package com.cassio.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "adjetivo")
public interface AdjetivoClient {
	@GetMapping("/")
	public String getAdjetivo();

}
