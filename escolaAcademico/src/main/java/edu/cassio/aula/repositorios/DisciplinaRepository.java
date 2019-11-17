package edu.cassio.aula.repositorios;

import org.springframework.data.repository.CrudRepository;
import edu.cassio.aula.entidades.Disciplina;

public interface DisciplinaRepository 
extends CrudRepository<Disciplina, Integer> {
}
