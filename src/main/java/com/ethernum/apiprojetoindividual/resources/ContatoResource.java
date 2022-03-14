package com.ethernum.apiprojetoindividual.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ethernum.apiprojetoindividual.entities.Contato;
import com.ethernum.apiprojetoindividual.services.ContatoService;


@RestController
@RequestMapping("/Contato")
@CrossOrigin(origins = "http://localhost:3000/contato")
public class ContatoResource {
	
	@Autowired
	private ContatoService service; 
	@GetMapping
	public List<Contato> findAll(){
		return service.findAll();
	}
}

