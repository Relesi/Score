package com.relesi.score.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relesi.score.domain.Categoria;
import com.relesi.score.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
	
}
