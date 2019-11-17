package edu.cassio.escolafinanceiro.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
 
@Transactional
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class ContaRecebida {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Long alunoId;
	
	private Long centroCustoId;
	
	private String nomeAluno;
	
	private Integer parcela;
	
	private Double valor;
	
	
	private Integer ano;
	
	private Integer sequencia;
//	@Temporal ( TemporalType.TIMESTAMP)
//	private LocalDateTime dataHora;
	

}
