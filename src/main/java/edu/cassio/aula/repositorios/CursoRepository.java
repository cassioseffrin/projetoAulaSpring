package edu.cassio.aula.repositorios;

import org.springframework.data.repository.CrudRepository;

import edu.cassio.aula.entidades.Curso;
 
public interface CursoRepository extends CrudRepository<Curso, Long> {

}
