package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="funcionario")
@PrimaryKeyJoinColumn(name="id_usuario")
public abstract class HerancaFuncionario extends HerancaUsuario{
	
	private String cargo;
	
	private String salario;
	
	public HerancaFuncionario(String nome, String cpf, String cargo, String salario) {
		super(nome, cpf);
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public HerancaFuncionario() {
		super();
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
