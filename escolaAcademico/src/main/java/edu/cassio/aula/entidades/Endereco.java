package edu.cassio.aula.entidades;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;
 

@Entity
@Getter
@Setter
@Transactional
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class Endereco {

 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String bairro;
    private String rua;
    private String cidade;
 
 
    @OneToOne(mappedBy = "endereco")
    private Aluno aluno;
 
   
}