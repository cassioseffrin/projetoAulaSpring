package edu.cassio.aula.controllers;

import edu.cassio.aula.entidades.Curso;
import edu.cassio.aula.repositorios.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/curso")
public class CursoController extends RESTController<Curso, Long> {

    @Autowired
    public CursoController(CrudRepository<Curso, Long> repo) {
        super(repo);
    }
}