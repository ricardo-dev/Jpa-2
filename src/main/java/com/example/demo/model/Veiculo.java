package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnore
	private String placa;
	
	private String modelo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_proprietario")
	private VeiculoProprietario proprietario;
	
	@OneToOne(optional=false)
	@JoinColumn(name="id_motor")
	private VeiculoMotor motor;
	
	@ManyToMany
	@JoinTable(name="veiculo_acessorio",
		joinColumns = @JoinColumn(name="id_veiculo"),
		inverseJoinColumns = @JoinColumn(name="id_acessorio"))
	private Set<VeiculoAcessorio> acessorios = new HashSet<>(); //não haver repeticoes - list permite
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public VeiculoProprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(VeiculoProprietario proprietario) {
		this.proprietario = proprietario;
	}

	public VeiculoMotor getMotor() {
		return motor;
	}

	public void setMotor(VeiculoMotor motor) {
		this.motor = motor;
	}

	public Set<VeiculoAcessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(Set<VeiculoAcessorio> acessorios) {
		this.acessorios = acessorios;
	}
}
