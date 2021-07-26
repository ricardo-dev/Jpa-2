package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
@PrimaryKeyJoinColumn(name="id_usuario")
public class HerancaCliente extends HerancaUsuario {
	
	private boolean bloqueado;
	
	private BigDecimal limiteCredito;
	
	private BigDecimal rendaMensal;

	public HerancaCliente(String nome, String cpf, boolean bloqueado, BigDecimal limiteCredito,
			BigDecimal rendaMensal) {
		super(nome, cpf);
		this.bloqueado = bloqueado;
		this.limiteCredito = limiteCredito;
		this.rendaMensal = rendaMensal;
	}
	
	public HerancaCliente( ) {
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
