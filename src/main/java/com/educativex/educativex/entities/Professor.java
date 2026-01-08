package com.educativex.educativex.entities;

import java.util.Objects;

public class Professor extends Usuario{
	private static final long serialVersionUID = 1L;
	private String materiaDEVE_SER_ALTERADA;
	
	public Professor() {
		super();
	}

	public Professor(Long id, String nome, String email, String senha, String materiaDEVE_SER_ALTERADA) {
		super(id, nome, email, senha);
		this.materiaDEVE_SER_ALTERADA = materiaDEVE_SER_ALTERADA;
	}

	public String getmateriaDEVE_SER_ALTERADA() {
		return materiaDEVE_SER_ALTERADA;
	}

	public void setmateriaDEVE_SER_ALTERADA(String materiaDEVE_SER_ALTERADA) {
		this.materiaDEVE_SER_ALTERADA = materiaDEVE_SER_ALTERADA;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(materiaDEVE_SER_ALTERADA);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(materiaDEVE_SER_ALTERADA, other.materiaDEVE_SER_ALTERADA);
	}
	
}
