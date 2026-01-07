package com.educativex.educativex.entities;

import java.util.Objects;

public class Aluno extends Usuario{
	private static final long serialVersionUID = 1L;
	private String matricula;
	
	public Aluno() {
		super();
	}

	public Aluno(Long id, String nome, String email, String senha, String matricula) {
		super(id, nome, email, senha);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(matricula);
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
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
}
