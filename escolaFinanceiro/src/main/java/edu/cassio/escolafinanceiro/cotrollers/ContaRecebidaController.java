package edu.cassio.escolafinanceiro.cotrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.cassio.escolafinanceiro.dto.AlunoDTO;
import edu.cassio.escolafinanceiro.dto.ContaAlunoDTO;
import edu.cassio.escolafinanceiro.entidades.ContaRecebida;
import edu.cassio.escolafinanceiro.feign.EscolaMatriculaProxy;
import edu.cassio.escolafinanceiro.repositorios.ContaRecebidaRepository;

@Controller
@RequestMapping("/contaRecebida")
public class ContaRecebidaController extends RESTController<ContaRecebida, Long> {
	@Autowired
	private EscolaMatriculaProxy escolaMatriculaProxy;

	
	@Autowired
	private  ContaRecebidaRepository contaRecebidaRepo ;
	
	@Autowired
	public ContaRecebidaController(CrudRepository<ContaRecebida, Long> repo) {
		super(repo);
	}
	
 
	@GetMapping(value="/bucarPorAluno/{id}" )
    public @ResponseBody List<ContaRecebida> buscarPorAluno(@PathVariable  Long id) {
           List<ContaRecebida> lstContas = this.contaRecebidaRepo.findByAlunoId(id);
           return lstContas;
    }

	@GetMapping("/pegarDadosFinanceiro/{id}")
	public @ResponseBody ContaAlunoDTO pegarDados(@PathVariable Long id) {
		RestTemplate rest = new RestTemplate();
		String url = "http://localhost:8080/aluno/" + id;
		AlunoDTO aluno = rest.getForObject(url, AlunoDTO.class);
		List<ContaRecebida> lstContas =  buscarPorAluno(id);
		lstContas.forEach(c -> c.setNomeAluno(aluno.getNome()));
		ContaAlunoDTO contaAluno = new ContaAlunoDTO(aluno, lstContas);
		return contaAluno;
	}

	@GetMapping("/pegarDadosFinanceiro-feign/{id}")
	public @ResponseBody AlunoDTO pegarDadosFeign(@PathVariable Long id) {
		return  escolaMatriculaProxy.pegarDados(id);
	}

}