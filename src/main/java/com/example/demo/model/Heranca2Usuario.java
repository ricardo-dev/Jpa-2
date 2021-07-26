package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Heranca2Usuario {
	
	@Id
	@GeneratedValue(generator="inc")
	@GenericGenerator(name="inc", strategy="increment")
	private Long id;
	
	private String nome;
	
	private String cpf;

	public Heranca2Usuario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Heranca2Usuario() {
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
