package com.conmiciv.service;

import java.util.List;

import com.conmiciv.model.Proveedor;

public interface IProveedorService {

	void registrar(Proveedor proveedor);
	
	void modificar (Proveedor proveedor);
	
	void eliminar(int IdProveedor);
	
	Proveedor ListarId(int IdProveedor);
	
	List<Proveedor> listar();
	
	
	
	
	
}
