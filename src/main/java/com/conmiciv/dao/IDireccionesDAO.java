package com.conmiciv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.conmiciv.model.Direcciones;

@Repository
public interface IDireccionesDAO extends JpaRepository<Direcciones,Integer> {

	
}
