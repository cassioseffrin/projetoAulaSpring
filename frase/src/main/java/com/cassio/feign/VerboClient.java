package com.cassio.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "verbo")
public interface VerboClient {
	@GetMapping("/")
	public String getVerbo();

}
