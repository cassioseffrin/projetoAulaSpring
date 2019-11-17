package edu.cassio.aula.entidades;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@EqualsAndHashCode 
@ToString
@Getter
@Setter
public class Professor {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    private String nome;
 
    private String email;

    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricula")
//	private Collection<Disciplina> disciplinaCollection;

}