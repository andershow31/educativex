package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.Objects;

public class AnoEscolar implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome_ano_escolar;
	public AnoEscolar() {}
	
	
	public AnoEscolar(Long id, String nome_ano_escolar) {
		super();
		this.id = id;
		this.nome_ano_escolar = nome_ano_escolar;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome_ano_escolar() {
		return nome_ano_escolar;
	}
	public void setNome_ano_escolar(String nome_ano_escolar) {
		this.nome_ano_escolar = nome_ano_escolar;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, nome_ano_escolar);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnoEscolar other = (AnoEscolar) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome_ano_escolar, other.nome_ano_escolar);
	}
	


}
