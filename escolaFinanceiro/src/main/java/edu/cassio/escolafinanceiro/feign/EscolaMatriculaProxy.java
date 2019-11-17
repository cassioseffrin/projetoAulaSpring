package edu.cassio.escolafinanceiro.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.cassio.escolafinanceiro.dto.AlunoDTO;

//@FeignClient(url = "localhost:8080")
@FeignClient(name="aula")
public interface EscolaMatriculaProxy {
	@GetMapping("/aluno/{id}")
	public AlunoDTO pegarDados(@PathVariable("id") Long id);
}
