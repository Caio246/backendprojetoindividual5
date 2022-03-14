package com.ethernum.apiprojetoindividual.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ethernum.apiprojetoindividual.entities.Promocoes;
import com.ethernum.apiprojetoindividual.services.PromocoesService;



@RestController
@RequestMapping("/Promocoes")
@CrossOrigin(origins = "http://localhost:3000/Promocoes")
public class PromocoesResource {
	
	@Autowired
	private PromocoesService service;

	@GetMapping
	public List<Promocoes> findAll(){
		return service.findAll();
	}
}
