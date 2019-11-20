package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Products;
import com.example.project.repository.ProductsRepository;

@Service
public class ProductServiceImpl implements ProductService {

	ProductsRepository productsRepository;
	
	@Autowired
	public ProductServiceImpl(ProductsRepository productsRepository) {
		super();
		this.productsRepository = productsRepository;
	}

	@Override
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return (List<Products>) productsRepository.findAll();
	}

	@Override
	public void save(Products products) {
		// TODO Auto-generated method stub
		productsRepository.save(products);
	}

	@Override
	public Optional<Products> findById(Long id) {
		// TODO Auto-generated method stub
		return productsRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		productsRepository.deleteById(id);
		
	}

}
