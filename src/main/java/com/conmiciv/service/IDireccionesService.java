package com.conmiciv.service;

import java.util.List;

import com.conmiciv.model.Direcciones;

public interface IDireccionesService {

 	void registrar(Direcciones direcciones);
 	
 	void modificar(Direcciones direcciones);
 	
 	void eliminar(int idDirecciones);
	
	Direcciones listarId(int idDirecciones);
 
 	List<Direcciones> listar();
 	

 
}
