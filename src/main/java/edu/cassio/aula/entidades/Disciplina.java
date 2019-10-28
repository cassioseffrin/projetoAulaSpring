package edu.cassio.aula.entidades;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="disciplina")
@Transactional
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class Disciplina {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String nome;
	private Integer cargaHoraria;
	
	@ManyToMany(mappedBy = "disciplinasCollection")
    private Collection<Matricula> matriculasCollection;

}
