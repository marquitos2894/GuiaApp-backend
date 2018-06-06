package com.conmiciv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="equipo")
public class Equipo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipo;
	
	@Column(name="alias", nullable=false, length=20)
	private String Alias;
	
	@Column(name="modelo",nullable=false, length=20)
	private String Modelo;
	
	@Column(name="marca",nullable=false, length=20)
	private String Marca;

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getAlias() {
		return Alias;
	}

	public void setAlias(String alias) {
		Alias = alias;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}
	
	
}
