package com.conmciv.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conmiciv.dao.IDireccionesDAO;
import com.conmiciv.model.Direcciones;
import com.conmiciv.service.IDireccionesService;

@Service
public class DireccionesServiceImpl implements IDireccionesService{

	@Autowired
	private IDireccionesDAO dao;
	
	
	@Override
	public void registrar(Direcciones direcciones) {
		dao.save(direcciones);
		
	}

	@Override
	public void modificar(Direcciones direcciones) {
		dao.save(direcciones);
		
	}

	@Override
	public void eliminar(int idDirecciones) {
		dao.delete(idDirecciones);
		
	}

	@Override
	public Direcciones listarId(int idDirecciones) {
		// TODO Auto-generated method stub
		return dao.findOne(idDirecciones);
	}

	@Override
	public List<Direcciones> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	
}
