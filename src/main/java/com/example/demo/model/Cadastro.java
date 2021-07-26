package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="cadastro")
public class Cadastro {

	@EmbeddedId
	private CadastroId codigo;
	
	//@Temporal(TemporalType.DATE)
	private LocalDate dataCadastro;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_cadastro")
	private TipoCadastro tipoCadastro;
	
	@Lob
	@Column(length=100, nullable=false)
	private String longText;
	
	@Lob
	private byte[] foto;
	
	@Transient
	private String variavelSemMapear;
	
	private BigDecimal valor;

	public CadastroId getCodigo() {
		return codigo;
	}

	public void setCodigo(CadastroId codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public TipoCadastro getTipoCadastro() {
		return tipoCadastro;
	}

	public void setTipoCadastro(TipoCadastro tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}

	public String getLongText() {
		return longText;
	}

	public void setLongText(String longText) {
		this.longText = longText;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getVariavelSemMapear() {
		return variavelSemMapear;
	}

	public void setVariavelSemMapear(String variavelSemMapear) {
		this.variavelSemMapear = variavelSemMapear;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
