package com.example.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class PessoaEnderecoEmbedded {
	
	private String cep;
	
	private String bairro;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
