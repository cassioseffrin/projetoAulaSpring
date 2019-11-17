package edu.cassio.aula.repositorios;

import org.springframework.data.repository.CrudRepository;

import edu.cassio.aula.entidades.Endereco;
import edu.cassio.aula.entidades.Turma;

// Sera  AUTO IMPLEMENTADO pelo Spring em um Bean chamado turmaRepository
// CRUD  

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

}
