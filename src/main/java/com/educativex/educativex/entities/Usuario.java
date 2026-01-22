package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.educativex.educativex.entities.enums.Tipo_usuario;


@Document(collection = "usuario")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	@Id
	private String id;
	private String nome;
	private String email;
	private String senha;
	private Tipo_usuario tipo_usuario;
	public Usuario() {
	}	
	
	public Usuario(String id, String nome, String email, String senha, Tipo_usuario tipo_usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
		}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Tipo_usuario getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(Tipo_usuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
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
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
	
}
