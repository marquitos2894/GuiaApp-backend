package com.conmiciv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conmiciv.dao.IEmpresaDAO;
import com.conmiciv.model.Empresa;
import com.conmiciv.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

	@Autowired
	private IEmpresaDAO dao;
	
	@Override
	public void registrar(Empresa empresa) {
		// TODO Auto-generated method stub
		dao.save(empresa);
	}

	@Override
	public void modificar(Empresa empresa) {
		// TODO Auto-generated method stub
		dao.save(empresa);
	}

	@Override
	public void eliminar(int idEmpresa) {
		// TODO Auto-generated method stub
		dao.delete(idEmpresa);
	}

	@Override
	public Empresa listarId(int idEmpresa) {
		// TODO Auto-generated method stub
		return dao.findOne(idEmpresa);
	}

	@Override
	public List<Empresa> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
