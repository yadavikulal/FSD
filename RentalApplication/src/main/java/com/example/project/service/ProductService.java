package com.example.project.service;

import java.util.List;
import java.util.Optional;

import com.example.project.entity.Products;

public interface ProductService {

	public List<Products> findAll();
	public void save(Products products);
	public Optional<Products> findById(Long id);
	public void deleteById(Long id);
	
}
