package edu.cassio.aula;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import edu.cassio.aula.entidades.Disciplina;
import edu.cassio.aula.entidades.Turma;
import edu.cassio.aula.repositorios.AlunoRepository;

public class TurmaDisciplina {
	@Autowired
	private AlunoRepository alunoRepository;
	@Test
	public void test() {
		 Turma t = new Turma();
		 t.setNome("Info");
		 Disciplina d = new Disciplina();
		 Collection<Turma> turmaCollection = new ArrayList<>();
		 turmaCollection.add(t);
 
		 d.setCargaHoraria(60);
		 d.setNome("Frameworks");
		 assertNotNull(turmaCollection);
	}

}
