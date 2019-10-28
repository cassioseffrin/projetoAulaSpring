package edu.cassio.aula.entidades;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

 
@Getter
@Setter
@Entity // Hibernate vai criar esta tabela 
@Transactional
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class Aluno {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
   
    private String nome;

    private String email;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
	private Collection<Matricula> matriculasCollection;
   

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
    
}

