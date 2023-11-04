package com.pe.crce.biblioteca.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pe.crce.biblioteca.model.Editorial;
import com.pe.crce.biblioteca.repository.EditorialRepository;
import com.pe.crce.biblioteca.service.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService{
	
	EditorialRepository editorialRepository;		

	public EditorialServiceImpl(EditorialRepository editorialRepository) {
		this.editorialRepository = editorialRepository;
	}

	@Override
	public Editorial save(Editorial editorial) {
		return this.editorialRepository.save(editorial);
	}

	@Override
	public Editorial update(Editorial editorial, Long id) {
		Editorial bean = this.editorialRepository.findById(id).get();
		bean.setName(editorial.getName());
		return this.editorialRepository.save(editorial);
	}

	@Override
	public Editorial findById(Long id) {
		Editorial bean = this.editorialRepository.findById(id).get();
		return bean;
	}

	@Override
	public List<Editorial> findAll() {
		return this.editorialRepository.findAll();
	}

}
