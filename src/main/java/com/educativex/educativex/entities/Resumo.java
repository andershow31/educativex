package com.educativex.educativex.entities;

public class Resumo extends Atividades{
	private static final long serialVersionUID = 1L;
	private String conteudo;
	
	public Resumo() {}
	
	public Resumo(String conteudo) {
		super();
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	
}
