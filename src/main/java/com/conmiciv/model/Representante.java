package com.conmiciv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="representante")
public class Representante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRepresentante;
	
	@ManyToOne
	@JoinColumn(name="idProveedor", nullable = false)
	private Proveedor proveedor;
	
	@Column(name="nombre", nullable=false, length=50)
	private String Nombre;
	@Column(name="dni", nullable=false, length=50)
	private String dni;
	public int getIdRepresentante() {
		return idRepresentante;
	}
	public void setIdRepresentante(int idRepresentante) {
		this.idRepresentante = idRepresentante;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	
	
	
}
