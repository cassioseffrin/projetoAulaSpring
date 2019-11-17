package edu.cassio.aula;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import edu.cassio.aula.controllers.CursoController;
import edu.cassio.aula.entidades.Curso;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class CursoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private Curso curso;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {

//		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("lista de alunos")));
	}

}