package br.ufc.persist.model;

import javax.persistence.Entity;

@Entity
public class Pesquisador extends Funcionario {

	private String areaAtuacao;
	
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
}
