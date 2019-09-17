package edu.cassio.aula.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

 

public abstract class CRUDController<T> {
	

	@GetMapping(path = "/testCrud")
	public @ResponseBody String getString() {
		return "Apenas uma string";
	}


}