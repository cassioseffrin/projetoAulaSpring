package com.cassio.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "sujeito")
public interface SujeitoClient {
	@GetMapping("/")
	public String getSujeito();

}
