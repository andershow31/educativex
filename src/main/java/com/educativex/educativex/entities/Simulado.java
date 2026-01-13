package com.educativex.educativex.entities;

import java.util.ArrayList;

public class Simulado extends Atividades{
	private static final long serialVersionUID = 1L;
	private ArrayList<Questao> questoes;
	public Simulado() {}
	public Simulado(ArrayList<Questao> questoes) {
		this.questoes = questoes;		
	}
	
	public ArrayList<Questao> getQuestoes() {
		return questoes;
	}	

}
