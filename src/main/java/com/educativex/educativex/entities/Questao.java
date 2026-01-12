package com.educativex.educativex.entities;

import java.util.ArrayList;

public class Questao extends Atividades{
	private static final long serialVersionUID = 1L;
	private String enunciado;
	private ArrayList<String> alternativas;
	private int resposta; //a intenção aqui é que acessar o indice por meio do método get()
	//ou seja, questao1.get(resposta), fazer método de verificação da questão
	private String resposta_discursiva;
	public Questao() {}
	
	public Questao(String enunciado, ArrayList<String> alternativas, int resposta) {
		super();
		this.enunciado = enunciado;
		this.alternativas = alternativas;
		this.resposta = resposta;
	} //Esse caso se for questão com alternativas

	public Questao(String enunciado, String resposta_discursiva) {
		super();
		this.enunciado = enunciado;
		this.resposta_discursiva = resposta_discursiva;
	} //tem que adicionar um jeito do professor acessar a resposta no caso de questão discursiva, 
	//ou um jeito do aluno comparar com a resposta correta

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public ArrayList<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(ArrayList<String> alternativas) {
		this.alternativas = alternativas;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}

	public String getResposta_discursiva() {
		return resposta_discursiva;
	}

	public void setResposta_discursiva(String resposta_discursiva) {
		this.resposta_discursiva = resposta_discursiva;
	}
	
	
	
}
