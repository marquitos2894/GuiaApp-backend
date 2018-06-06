package com.conmiciv.model;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="guia")
public class Guia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGuia;
	
	@ManyToOne
	@JoinColumn(name="id_empresa", nullable=false)
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name="id_proveedor", nullable=false)
	private Proveedor proveedor;
	
	@ManyToOne
	@JoinColumn(name="id_equipo", nullable=false)
	private Equipo equipo;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDate fecha;
	
	@Column(name="puntopartida", nullable=false, length = 100)
	private String puntopartida;
	
	@Column(name="puntollegada", nullable=false, length = 100)
	private String puntollegada;
	
	@Column(name="representante", nullable=false, length = 50)
	private String representante;
	
	@Column(name="referencia", nullable=false, length = 100)
	private String referencia;


	@OneToMany(mappedBy = "guia", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<DetalleGuia> detalleguia;
	
	
	public int getIdGuia() {
		return idGuia;
	}


	public void setIdGuia(int idGuia) {
		this.idGuia = idGuia;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	
	
	public String getPuntopartida() {
		return puntopartida;
	}


	public void setPuntopartida(String puntopartida) {
		this.puntopartida = puntopartida;
	}


	public String getPuntollegada() {
		return puntollegada;
	}


	public void setPuntollegada(String puntollegada) {
		this.puntollegada = puntollegada;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getRepresentante() {
		return representante;
	}


	public void setRepresentante(String representante) {
		this.representante = representante;
	}


	public List<DetalleGuia> getDetalleguia() {
		return detalleguia;
	}


	public void setDetalleguia(List<DetalleGuia> detalleguia) {
		this.detalleguia = detalleguia;
	}
	
	
	
	
	
	
}
