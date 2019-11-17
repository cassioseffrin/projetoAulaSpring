package edu.cassio.aula.entidades;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
@Table(name = "turma")

public class Matricula implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(optional = true)
	private Aluno aluno;

	@ManyToOne(optional = true)
	private Turma turma;

	@ManyToOne(optional = true)
	private Curso curso;

	@JoinTable(name = "matricula_disciplina", joinColumns = {
			@JoinColumn(name = "matricula_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "disciplina_id", referencedColumnName = "id") })
	@ManyToMany
	private Collection<Disciplina> disciplinasCollection;
}