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

import com.conmiciv.model.Empresa;
import com.conmiciv.service.IEmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	private IEmpresaService service;
	
	
	@GetMapping(value="/listar", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Empresa>> listar(){
	List<Empresa> empresa = new ArrayList<>();	
		try { 
			empresa=service.listar();
			
		}catch(Exception e) {
			return new ResponseEntity<List<Empresa>>(empresa,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Empresa>>(empresa,HttpStatus.OK);
	}
	
	
	@PostMapping(value="/registrar", produces=MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> registrar(@RequestBody Empresa empresa){
		int resultado=0;
		try {
			service.registrar(empresa);
			resultado=1;
			
		}catch(Exception e) {
			resultado=0;
		}
		
		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}
	
	@PutMapping(value="/actualizar", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Empresa empresa){
		int resultado = 0;
		try {
			service.modificar(empresa);
			resultado =1;
		}catch (Exception e) {
			resultado = 0;
		}
		
		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/eliminar/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		int resultado = 0;
		try {
			service.eliminar(id);
			resultado=1;
		}catch (Exception e) {
			resultado=0;
		}
		
		return new ResponseEntity<Integer>(resultado,HttpStatus.OK);
	}

}
