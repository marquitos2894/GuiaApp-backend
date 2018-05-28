package com.conmiciv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conmiciv.model.Empresa;

@Repository
public interface IEmpresaDAO extends JpaRepository<Empresa, Integer> {

	
	
}
