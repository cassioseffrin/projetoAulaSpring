package edu.cassio.aula.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.cassio.aula.entidades.Aluno;

@RequestMapping("/aluno")
public interface AlunoOperacoes {

	 
	    @GetMapping("/todos")
		@ResponseBody
	    List<Aluno> getTodos();
	 
	    @GetMapping("/{id}")
		@ResponseBody
	    Optional<Aluno> getById(@PathVariable int id);
	 
	    @PutMapping("/alterar/{id}")
	    public ResponseEntity<Object> alterar(@RequestBody Aluno aluno, @PathVariable int id);
	  
	    @PostMapping("/salvar")
	    public ResponseEntity<Object> salvar(@RequestBody Aluno aluno );

}
