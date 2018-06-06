package com.conmiciv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conmiciv.model.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor,Integer> {

}
