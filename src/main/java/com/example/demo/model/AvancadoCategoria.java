package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="categoria")
public class AvancadoCategoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=60, nullable=false)
	private String nome;
	
	@JsonIgnoreProperties("categoria")
	@OneToMany(mappedBy="categoria", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<AvancadoProduto> produtos;

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

	public List<AvancadoProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<AvancadoProduto> produtos) {
		this.produtos = produtos;
	}

}
