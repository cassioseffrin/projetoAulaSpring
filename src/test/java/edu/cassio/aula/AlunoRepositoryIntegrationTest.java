package edu.cassio.aula;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.cassio.aula.entidades.Aluno;
import edu.cassio.aula.entidades.Endereco;

import edu.cassio.aula.repositorios.AlunoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlunoRepositoryIntegrationTest {

	@Autowired
	private AlunoRepository alunoRepository;

	@Test
	public void salvarAluno() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setNome("Fernanda Lima");
		aluno.setEmail("fernandalima@gmail.com");
		Endereco e = new Endereco();
		e.setBairro("centro");
		e.setCidade("Sao Paulo");
		e.setRua("Rua Paulista, 4253");
		e.setAluno(aluno);

		aluno.setEndereco(e);
		alunoRepository.save(aluno);

		assertNotNull(aluno.getId());

	}

	@Test
	public void procurarPorNome() {
		Aluno aluno = new Aluno();
		aluno.setNome("Fernanda Lima");
		aluno.setId(1);
		aluno.setEmail("fernandalima@gmail.com");
		Endereco e = new Endereco();
		e.setBairro("centro");
		e.setCidade("Sao Paulo");
		e.setRua("Rua Paulista, 4253");
		e.setAluno(aluno);

		Aluno alunoBanco = alunoRepository.findById(1).orElse(new Aluno());

		assertEquals("ok", alunoBanco.getNome(), aluno.getNome());
	}

}