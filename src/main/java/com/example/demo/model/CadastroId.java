package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CadastroId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	
	private String telefone;
	
	public CadastroId(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public CadastroId() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
