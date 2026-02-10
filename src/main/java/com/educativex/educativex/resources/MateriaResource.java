package com.educativex.educativex.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educativex.educativex.entities.Materia;
import com.educativex.educativex.servicies.MateriaService;

@RestController

@RequestMapping("/materias")
public class MateriaResource {
	
	@Autowired
	private MateriaService service;
	
	@GetMapping
	public ResponseEntity<List<Materia>> findAll(){
		List<Materia> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	

}
