package edu.cassio.escolafinanceiro.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.cassio.escolafinanceiro.entidades.ContaRecebida;

 
public interface ContaRecebidaRepository extends CrudRepository<ContaRecebida, Long> {

	
	public List<ContaRecebida> findByAlunoId(Long id);
	
}
