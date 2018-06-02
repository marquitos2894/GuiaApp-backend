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

import com.conmiciv.model.Equipo;
import com.conmiciv.service.IEquipoService;

@RestController
@RequestMapping("/equipo")
public class EquipoController {
	
	@Autowired
	private IEquipoService service;
	
	@GetMapping(value = "/listar", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Equipo>> listar(){
		List<Equipo> equipo = new ArrayList<>();
		try {
			equipo = service.listar();
		}catch (Exception e) {
			
			return new ResponseEntity<List<Equipo>>(equipo,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Equipo>>(equipo,HttpStatus.OK);
	}
	
	@PostMapping(value="/registrar", produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> registrar(@RequestBody Equipo equipo){
		int resultado = 0;
		try {
			service.registrar(equipo);
			resultado =1;
		}catch(Exception e) {
			resultado=0;
			//return new ResponseEntity<Integer>(resultado,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Integer>(resultado,HttpStatus.OK);
	}
	
	@PutMapping(value="/actualizar",produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Equipo equipo){
		int resultado=0;
		try {
			service.modificar(equipo);
			
		}catch(Exception e) {
			resultado = 0;
			//return new ResponseEntity<Integer>(resultado,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Integer> (resultado,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/eliminar/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		int resultado = 0;
		try {
			service.eliminar(id);
			resultado = 1;
		}catch (Exception e) {
			resultado =0;
			//return new ResponseEntity<Integer>(resultado,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Integer> (resultado,HttpStatus.OK);
	}
	
	
	
}
