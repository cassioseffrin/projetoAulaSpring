package com.cassio.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "artigo")
public interface ArtigoClient {
	@GetMapping("/")
	public String getArtigo();

}
