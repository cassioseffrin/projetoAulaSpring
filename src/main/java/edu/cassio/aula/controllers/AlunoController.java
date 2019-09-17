package edu.cassio.aula.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.cassio.aula.entidades.Aluno;
import edu.cassio.aula.entidades.Endereco;
import edu.cassio.aula.entidades.Turma;
import edu.cassio.aula.repositorios.AlunoRepository;
import edu.cassio.aula.repositorios.EnderecoRepository;
import edu.cassio.aula.repositorios.TurmaRepository;

@Controller
@RequestMapping("/aluno")
public class AlunoController extends CRUDController<Aluno> 
implements AlunoOperacoes {
	

	// Isso significa pegar o bean chamado userRepository
	// Que é gerado automaticamente pelo Spring, vamos usá-lo para manipular os
	// dados
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private TurmaRepository turmaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	// @ResponseBody significa que a String retornada é a resposta, não um nome
	// de view/formulario etc
	// @RequestParam significa que é um parâmetro da solicitação GET

	@GetMapping(path = "/adicionar")
	public @ResponseBody String adicionarAluno(@RequestParam String nome, 
			@RequestParam String email,
			@RequestParam Integer turma) {

		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setEmail(email);
		
		Endereco e = new Endereco();
		e.setBairro("centro");
		e.setCidade("Concordia");
		e.setRua("Victor Sopelsa");
		enderecoRepository.save(e);
	 
		Optional<Turma> obj = turmaRepository.findById(turma);
		Turma turmaEncontrada = new Turma();
		if (obj.isPresent()){
		    turmaEncontrada = obj.get();
		}
		
		aluno.setEndereco(e);
		alunoRepository.save(aluno);

		return "Salvo!";
	}
	
 

	@Override
	public List<Aluno> getTodos() {
		return (List<Aluno>) alunoRepository.findAll();
	}

 
	@Override
	public Optional<Aluno> getById(@PathVariable int id) {
		  return alunoRepository.findById(id);
	}


	@Override
	public ResponseEntity<Object> alterar(@RequestBody Aluno aluno, int id) {
		Optional<Aluno> alunoOpcional = alunoRepository.findById(id);
		if (!alunoOpcional.isPresent())
			return ResponseEntity.notFound().build();
		aluno.setId(id);
		alunoRepository.save(aluno);
		return ResponseEntity.ok(aluno);
	}

	@Override
	public ResponseEntity<Object> salvar(@RequestBody Aluno aluno) {
		Endereco e = aluno.getEndereco();
		enderecoRepository.save(e);
		aluno.setEndereco(e);
		alunoRepository.save(aluno);
		return ResponseEntity.ok(aluno);
	}




 
}
