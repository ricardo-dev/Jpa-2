package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="motor")
public class VeiculoMotor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="qtd_cilindros")
	private int qdtCilindros;
	
	@Column(name="numero_serie")
	private String numeroSerie;
	
	// Bidirecional
	@OneToOne(mappedBy="motor") // é o nome da propriedade em veiculo
	private Veiculo veiculo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQdtCilindros() {
		return qdtCilindros;
	}

	public void setQdtCilindros(int qdtCilindros) {
		this.qdtCilindros = qdtCilindros;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
