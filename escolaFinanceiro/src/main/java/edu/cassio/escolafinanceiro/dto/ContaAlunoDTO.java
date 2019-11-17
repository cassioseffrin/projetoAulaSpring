package edu.cassio.escolafinanceiro.dto;

import java.util.List;

import edu.cassio.escolafinanceiro.entidades.ContaRecebida;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaAlunoDTO {
	
	private AlunoDTO aluno;
	
	private List<ContaRecebida> lstContas;
	
	public ContaAlunoDTO (AlunoDTO a, List<ContaRecebida> lst){
		this.aluno = a;
		this.lstContas = lst;
	}
	

}
