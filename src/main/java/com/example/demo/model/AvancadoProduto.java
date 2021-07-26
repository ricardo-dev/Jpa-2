package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="produto")
public class AvancadoProduto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=60, nullable=false)
	private String nome;
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	@JoinColumn(name="id_categoria")
	private AvancadoCategoria categoria;

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

	public AvancadoCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(AvancadoCategoria categoria) {
		this.categoria = categoria;
	}
}
