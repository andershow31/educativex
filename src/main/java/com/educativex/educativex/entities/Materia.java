package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.Objects;

public class Materia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome_materia;
	private AnoEscolar anoEscolar;
	public Materia(){}
	
	
	
	public Materia(String nome_materia, AnoEscolar anoEscolar) {
		super();
		this.nome_materia = nome_materia;
		this.anoEscolar = anoEscolar;
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
