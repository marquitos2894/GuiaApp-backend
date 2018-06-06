package com.conmiciv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conmiciv.model.Direcciones;
import com.conmiciv.service.IDireccionesService;

@RestController
@RequestMapping("/direcciones")
public class DireccionesController {
	
	@Autowired
	private IDireccionesService service;
	
	
	@GetMapping(value="/listar", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Direcciones>> listar(){
		List<Direcciones> direcciones = new ArrayList<>();
		try {
			direcciones = service.listar();
		}catch(Exception e) {
		
			return new ResponseEntity<List<Direcciones>>(direcciones,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Direcciones>>(direcciones,HttpStatus.OK);
	}
	
	
	@PostMapping(value="/registrar",produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> registrar(@RequestBody Direcciones direcciones){
		int resultado = 0;
		try {
			service.registrar(direcciones);
			resultado = 1;
		}catch (Exception e) {
			resultado =0;
		}
		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}
	
	@PutMapping(value="/actualizar", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Direcciones direcciones){
		int resultado=0;
		try {
			service.modificar(direcciones);
			resultado=1;
		}catch(Exception e) {
			resultado=0;
		}
		
		return new ResponseEntity<Integer>(resultado,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/eliminar/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> eliminar(@PathVariable("id") int idDirecciones){
	int resultado = 1;
	try {
		service.eliminar(idDirecciones);
		resultado=1;
	}catch(Exception e) {
		resultado =0;
	}
		
		return new ResponseEntity<Integer>(resultado,HttpStatus.OK);
	}

}
