package com.conmiciv.service;

import java.util.List;

import com.conmiciv.model.Empresa;


public interface IEmpresaService {

	void registrar(Empresa empresa);
	
	void modificar(Empresa empresa);
	
	void eliminar(int idEmpresa);
	
	Empresa listarId(int idEmpresa);
	
	List<Empresa> listar();
	
}
