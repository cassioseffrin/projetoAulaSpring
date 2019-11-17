package edu.cassio.aula.controllers;

 
import edu.cassio.aula.entidades.Endereco;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/endereco")
public class EnderecoController extends RESTController<Endereco, Long> {

    @Autowired
    public EnderecoController(CrudRepository<Endereco, Long> repo) {
        super(repo);
    }
}