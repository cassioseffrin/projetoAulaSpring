package edu.cassio.aula.repositorios;

import org.springframework.data.repository.CrudRepository;

import edu.cassio.aula.entidades.Professor;

// Sera  AUTO IMPLEMENTADO pelo Spring em um Bean chamado professorRepository
// CRUD  

public interface ProfessorRepository 
extends CrudRepository<Professor, Integer> {

}
