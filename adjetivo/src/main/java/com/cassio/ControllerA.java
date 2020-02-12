package com.cassio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerA {
	@Value("${adjetivos}")
	public String adjetivos;

	@GetMapping("/")
	public @ResponseBody String getWord() {
		String[] arr = adjetivos.split(",");
		int i = (int) Math.round(Math.random() * (arr.length - 1));
		return arr[i];
	}
	
	@GetMapping("/home")
	public String adjetivo() {
		return "teste";
	}

}
