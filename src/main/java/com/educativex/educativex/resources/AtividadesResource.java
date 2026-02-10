package com.educativex.educativex.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educativex.educativex.entities.Atividades;
import com.educativex.educativex.servicies.AtividadesService;

@RestController

@RequestMapping("/atividades")
public class AtividadesResource {
	
	@Autowired
	private AtividadesService service;
	
	@GetMapping
	public ResponseEntity<List<Atividades>> findAll(){
		List<Atividades> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	

}
