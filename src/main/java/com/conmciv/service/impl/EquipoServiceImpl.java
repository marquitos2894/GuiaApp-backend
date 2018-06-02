package com.conmciv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conmiciv.dao.IEquipoDAO;
import com.conmiciv.model.Equipo;
import com.conmiciv.service.IEquipoService;

@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	private IEquipoDAO dao;
	
	@Override
	public void registrar(Equipo equipo) {
		// TODO Auto-generated method stub
		dao.save(equipo);
	}

	@Override
	public void modificar(Equipo equipo) {
		// TODO Auto-generated method stub
		dao.save(equipo);
	}

	@Override
	public void eliminar(int idEquipo) {
		// TODO Auto-generated method stub
		dao.delete(idEquipo);
	}

	@Override
	public Equipo listarId(int idEquipo) {
		// TODO Auto-generated method stub
		return dao.findOne(idEquipo);
	}

	@Override
	public List<Equipo> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
