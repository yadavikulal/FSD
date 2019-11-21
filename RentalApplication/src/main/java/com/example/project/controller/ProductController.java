package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Products;
import com.example.project.service.ProductService;

@RestController
public class ProductController {

	ProductService productService;
	
	@Autowired
		public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

		@GetMapping("/products")
		public List<Products> findAll(){
			return productService.findAll();
		}
		
		@PostMapping("/products")
		public void createPerson(Products products) {
			productService.save(products);
		}
		
		@GetMapping("/products{id}")
		public Optional<Products> findById(@PathVariable Long id) {
			return productService.findById(id);
		}
		
		@DeleteMapping("/producs{id}")
		public void deleteById(@PathVariable Long id) {
			productService.deleteById(id);
		}
	
}
