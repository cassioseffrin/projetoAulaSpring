package com.cassio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("${verbos}")
	public String verbos;

	@GetMapping("/")
	public @ResponseBody String getWord() {
		String[] arr = verbos.split(",");
		int i = (int) Math.round(Math.random() * (arr.length - 1));
		return arr[i];
	}

}
