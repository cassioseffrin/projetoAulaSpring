package edu.cassio.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.cassio.aula.entidades.Disciplina;
import edu.cassio.aula.repositorios.DisciplinaRepository;
 

@Controller     
@RequestMapping(path="/disciplina")  
public class DisciplinaController {
 
	@Autowired 
	private DisciplinaRepository disciplinaRepository;
	 
	@GetMapping(path="/adicionar")  
	public @ResponseBody String adicionarProfessor (@RequestParam String nome
			, @RequestParam Integer cargaHoraria ) {
 
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nome);
		disciplina.setCargaHoraria(cargaHoraria);
 
		disciplinaRepository.save(disciplina);
		return "Sua discplina foi salva com sucesso!";
	}
	
	@GetMapping(path="/todos")
	public @ResponseBody Iterable<Disciplina> getDisicplinas() {
		return disciplinaRepository.findAll();
	}
}
