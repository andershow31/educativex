package com.educativex.educativex.entities;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.educativex.educativex.entities.enums.Tipo_usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "tb_usuario",
uniqueConstraints = 
@UniqueConstraint(columnNames = {"nome", "email"})
) //as linhas serão unicas com este comando
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)// a segunda anotação serve para criar um id automatico e ir incrementando, indica também que esta será a identificação
	private Long id;
	@Column(nullable = false)
	private String nome;
	private String email;
	private String senha;
	private Tipo_usuario tipo_usuario;
	public Usuario() {
	}	
	
	public Usuario(Long id, String nome, String email, String senha, Tipo_usuario tipo_usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
		}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
