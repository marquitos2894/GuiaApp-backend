package com.conmiciv.service;

import java.util.List;
import com.conmiciv.model.Equipo;

public interface IEquipoService {

	void registrar(Equipo equipo);
	
	void modificar(Equipo equipo);
	
	void eliminar(int idEquipo);
	
	Equipo listarId(int idEquipo);
	
	List<Equipo> listar();
}
