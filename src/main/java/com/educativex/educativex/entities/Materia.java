package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Materia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome_materia;
	private AnoEscolar anoEscolar;
	private Professor professor;
	private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public Materia(){}
	
	
	
	public Materia(String nome_materia, AnoEscolar anoEscolar, Professor professor, ArrayList<Aluno> listaAlunos) {
		super();
		this.nome_materia = nome_materia;
		this.anoEscolar = anoEscolar;
		this.professor = professor;
		this.listaAlunos = listaAlunos;
	}	
	

	public AnoEscolar getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(AnoEscolar anoEscolar) {
		this.anoEscolar = anoEscolar;
	}

	public String getNome_materia() {
		return nome_materia;
	}
	public void setNome_materia(String nome_materia) {
		this.nome_materia = nome_materia;
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
		return Objects.hash(anoEscolar, nome_materia);
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
		return anoEscolar == other.anoEscolar && Objects.equals(nome_materia, other.nome_materia);
	}
	

}
