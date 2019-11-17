package edu.cassio.aula.repositorios;

import org.springframework.data.repository.CrudRepository;

import edu.cassio.aula.entidades.Aluno;

// Sera  AUTO IMPLEMENTADO pelo Spring em um Bean chamado alunoRepository
// CRUD  

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

}
