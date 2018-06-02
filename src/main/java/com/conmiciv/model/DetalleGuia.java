package com.conmiciv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="detalle_guia")
public class DetalleGuia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_guia" , nullable=false)
	private Guia guia;
	
	
	@Column(name="nombre", nullable=false, length=100)
	private String nombre;
	
	@Column(name="nparte", nullable=false, length=20)
	private String nparte;
	
	@Column(name="cant", nullable=false)
	private int cant;

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Guia getGuia() {
		return guia;
	}

	public void setGuia(Guia guia) {
		this.guia = guia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNparte() {
		return nparte;
	}

	public void setNparte(String nparte) {
		this.nparte = nparte;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
	
	
	
	
	
}
