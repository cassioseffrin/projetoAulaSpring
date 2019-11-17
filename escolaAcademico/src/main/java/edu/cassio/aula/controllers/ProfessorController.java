package edu.cassio.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.cassio.aula.entidades.Professor;
import edu.cassio.aula.repositorios.ProfessorRepository;

@Controller     
@RequestMapping(path="/professor")

public class ProfessorController {
 
	@Autowired 
	private ProfessorRepository professorRepository;
	 
	@GetMapping(path="/adicionar")  
	public @ResponseBody String adicionarProfessor (@RequestParam String nome, @RequestParam String email ) {
 
		Professor prof = new Professor();
		prof.setNome(nome);
		prof.setEmail(email);
 
		professorRepository.save(prof);
		return "Salvo!";
	}
	
	@GetMapping(path="/todos")
	public @ResponseBody Iterable<Professor> getProfessores() {
		return professorRepository.findAll();
	}
}
