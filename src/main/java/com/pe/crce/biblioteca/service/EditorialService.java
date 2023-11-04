package com.pe.crce.biblioteca.service;

import com.pe.crce.biblioteca.model.Editorial;

import java.util.List;

public interface EditorialService {
	
	public Editorial save(Editorial editorial);
	
	public Editorial update(Editorial editorial, Long id);
	
	public Editorial findById(Long id);
	
	public List<Editorial> findAll();

}
