package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="funcionario_2")
public class Heranca2Funcionario extends Heranca2Usuario{
	
	private String cargo;
	
	private String salario;

	public Heranca2Funcionario() {
		super();
	}

	public Heranca2Funcionario(String nome, String cpf, String cargo, String salario) {
		super(nome, cpf);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
}
