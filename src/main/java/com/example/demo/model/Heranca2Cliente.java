package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cliente_2")
public class Heranca2Cliente extends Heranca2Usuario{
	
	private boolean bloqueado;
	
	private BigDecimal limiteCredito;
	
	private BigDecimal rendaMensal;

	public Heranca2Cliente(String nome, String cpf, boolean bloqueado, BigDecimal limiteCredito,
			BigDecimal rendaMensal) {
		super(nome, cpf);
		this.bloqueado = bloqueado;
		this.limiteCredito = limiteCredito;
		this.rendaMensal = rendaMensal;
	}

	public Heranca2Cliente() {
		super();
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public BigDecimal getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(BigDecimal rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
}
