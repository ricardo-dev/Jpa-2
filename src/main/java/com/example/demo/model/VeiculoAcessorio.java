package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="acessorio")
public class VeiculoAcessorio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	// Bidirecional
	@ManyToMany(mappedBy="acessorios") 
	private Set<Veiculo> veiculos = new HashSet<>(); // é o nome da propriedade em veiculo

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
