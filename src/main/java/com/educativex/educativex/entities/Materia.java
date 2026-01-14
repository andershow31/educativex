package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "tb_materia",
uniqueConstraints = 
@UniqueConstraint(columnNames = {"nome_materia", "anoEscolar"})
)

public class Materia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)//gera um id único automaticamente no banco de dados
	private Long id;
	@Column
	private String nome_materia;
	private AnoEscolar anoEscolar;
	private Professor professor;
	private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public Materia(){}
	
	
	
	public Materia(Long id, String nome_materia, AnoEscolar anoEscolar, Professor professor, ArrayList<Aluno> listaAlunos) {
		super();
		this.id = id;
		this.nome_materia = nome_materia;
		this.anoEscolar = anoEscolar;
		this.professor = professor;
		this.listaAlunos = listaAlunos;
	}	
	
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome_materia() {
		return nome_materia;
	}
	public void setNome_materia(String nome_materia) {
		this.nome_materia = nome_materia;
	}

	public AnoEscolar getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(AnoEscolar anoEscolar) {
		this.anoEscolar = anoEscolar;
	}



	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Aluno> getListaAlunos() {
		return listaAlunos;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, nome_materia);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome_materia, other.nome_materia);
	}




}
