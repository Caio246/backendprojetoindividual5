package com.ethernum.apiprojetoindividual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ethernum.apiprojetoindividual.entities.Contato;
import com.ethernum.apiprojetoindividual.repositories.ContatoRepository;


@Service                        
public class ContatoService {
	
	@Autowired
	private ContatoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Contato> findAll(){
		List<Contato> resultado = repository.findAll();
		return resultado;
	}
}
