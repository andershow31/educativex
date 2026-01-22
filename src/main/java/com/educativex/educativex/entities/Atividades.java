package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.Objects;

public class Atividades implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private String id;
	private Materia materia;
	public Atividades(){}	
	
	public Atividades(String nome, String id, Materia materia) {
		super();
		this.nome = nome;
		this.id = id;
		this.materia = materia;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atividades other = (Atividades) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
}
