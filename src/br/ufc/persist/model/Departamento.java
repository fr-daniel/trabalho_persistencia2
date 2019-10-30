package br.ufc.persist.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	@OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY)
	private List<Projeto> projetos;
	
	@OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY)
	private List<Funcionario> funcionarios;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Projeto> getProjetos() {
		return projetos;
	}
	
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

}
