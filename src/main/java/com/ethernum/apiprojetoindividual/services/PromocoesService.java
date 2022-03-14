package com.ethernum.apiprojetoindividual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ethernum.apiprojetoindividual.entities.Promocoes;
import com.ethernum.apiprojetoindividual.repositories.PromocoesRepository;


@Service
public class PromocoesService {
	
	@Autowired
	private PromocoesRepository repository;
	
	@Transactional(readOnly = true)
	public List<Promocoes> findAll(){
		List<Promocoes> resultado = repository.findAll();
		return resultado;
	}
}
