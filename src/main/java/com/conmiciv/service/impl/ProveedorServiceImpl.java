package com.conmiciv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conmiciv.dao.IProveedorDAO;
import com.conmiciv.model.Proveedor;
import com.conmiciv.service.IProveedorService;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	private IProveedorDAO Dao;
	
	
	@Override
	public void registrar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		Dao.save(proveedor);
	}

	@Override
	public void modificar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		Dao.save(proveedor);
	}

	@Override
	public void eliminar(int IdProveedor) {
		// TODO Auto-generated method stub
		Dao.delete(IdProveedor);
	}

	@Override
	public Proveedor ListarId(int IdProveedor) {
		// TODO Auto-generated method stub
		return Dao.findOne(IdProveedor);
	}

	@Override
	public List<Proveedor> listar() {
		// TODO Auto-generated method stub
		return Dao.findAll();
	}

}
