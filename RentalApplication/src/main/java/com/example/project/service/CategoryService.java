package com.example.project.service;

import java.util.List;
import java.util.Optional;

import com.example.project.entity.Category;

public interface CategoryService {

	public List<Category> findAll();
	public void save(Category category);
	public Optional<Category> findById(Long id);
	public void deleteById(Long id);
	
}
