package com.educativex.educativex.entities;

import java.util.Objects;

public class Professor extends Usuario{
	private static final long serialVersionUID = 1L;
	private Materia materia;
	
	public Professor() {
		super();
	}

	public Professor(Materia materia) {
		super();
		this.materia = materia;
	}

	public Materia materia() {
		return materia;
	}

	public void setmateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(materia);
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
		return Objects.equals(materia, other.materia);
	}
	
}
