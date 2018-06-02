package com.conmiciv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conmiciv.model.Equipo;

@Repository
public interface IEquipoDAO extends JpaRepository<Equipo,Integer> {

	
}
