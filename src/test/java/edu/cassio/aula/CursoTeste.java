package edu.cassio.aula;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import edu.cassio.aula.entidades.Curso;
import edu.cassio.aula.entidades.Disciplina;
import edu.cassio.aula.entidades.Turma;
import edu.cassio.aula.repositorios.AlunoRepository;
import edu.cassio.aula.repositorios.CursoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CursoTeste {

	@Autowired
	private CursoRepository cursoRepository;

	@Test
	public void test() {
		Curso c = new Curso();
		c.setNome("Engenharia de software");
		cursoRepository.save(c);

	}

}
