package edu.cassio.aula.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.cassio.aula.entidades.Disciplina;
import edu.cassio.aula.entidades.Turma;
import edu.cassio.aula.repositorios.DisciplinaRepository;
import edu.cassio.aula.repositorios.TurmaRepository;

@Controller     
@RequestMapping(path="/turma")  
public class TurmaController {
	@Autowired 
	private TurmaRepository turmaRepository;
	@Autowired 
	private DisciplinaRepository disciplinaRepository;
	
	// Isso significa pegar o bean chamado userRepository
	// Que é gerado automaticamente pelo Spring, vamos usá-lo para manipular os dados
	// @ResponseBody significa que a String  retornada é a resposta, não um nome de view/formulario etc
	// @RequestParam significa que é um parâmetro da solicitação GET 

	@GetMapping(path="/adicionar")  
	public @ResponseBody String addTurma (@RequestParam String nome
		 ) {
 
		Turma t = new Turma();
		t.setNome(nome);
 

		 Disciplina d = new Disciplina();
		 d.setCargaHoraria(60);
		 d.setNome("Frameworks");
		 disciplinaRepository.save(d);
//		 
//		 Collection<Disciplina> disciplinaCollection = new ArrayList<>();
//		 disciplinaCollection.add(d);
//		 t.setDisciplinaCollection(disciplinaCollection);
		turmaRepository.save(t);
		return "Salvo!";
	}
	
	@GetMapping(path="/todos")
	public @ResponseBody Iterable<Turma> getTodos() {
		//   retorna um JSON ou XML 
		return turmaRepository.findAll();
	}
}
