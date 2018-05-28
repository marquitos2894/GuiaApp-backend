package com.conmiciv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

}
