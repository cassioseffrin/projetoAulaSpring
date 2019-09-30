package edu.cassio.aula;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import edu.cassio.aula.entidades.Disciplina;
import edu.cassio.aula.entidades.Turma;

public class TurmaDisciplina {
    private static SessionFactory sessionFactory;
    private Session session;
	@Test
	public void test() {
		 Turma t = new Turma();
		 t.setNome("Info");
		 Disciplina d = new Disciplina();
		 Collection<Turma> turmaCollection = new ArrayList<>();
		 turmaCollection.add(t);
 
		 d.setCargaHoraria(60);
		 d.setNome("Frameworks");
//		 d.setTurmaCollection(turmaCollection);
		 assertNotNull(turmaCollection);
	}

}
