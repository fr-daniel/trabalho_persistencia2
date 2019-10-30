package br.ufc.persist.model;

import javax.persistence.Entity;

@Entity
public class Secretario extends Funcionario {

	private String grauEscolaridade;
	
	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}
	
	public void setGrauEscolaridade(String grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}
	
}
