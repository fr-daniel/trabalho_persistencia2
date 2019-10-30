package br.ufc.persist.model;

public class FuncionarioLimpeza extends Funcionario {

	private String jornadaTrabalho;
	private String cargo;
	private FuncionarioLimpeza gerente;

	public String getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(String jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public FuncionarioLimpeza getGerente() {
		return gerente;
	}

	public void setGerente(FuncionarioLimpeza gerente) {
		this.gerente = gerente;
	}

}
