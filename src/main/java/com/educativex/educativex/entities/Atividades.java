package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.Objects;

public class Atividades implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private Long id;
	public Atividades(){}	
	
	public Atividades(String nome, Long id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
