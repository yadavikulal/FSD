package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.entity.ProductOrders;
import com.example.project.service.ProductOrdersService;

@RestController
public class ProductOrdersController {

	ProductOrdersService productOrdersService;

	@Autowired
	public ProductOrdersController(ProductOrdersService productOrdersService) {
		super();
		this.productOrdersService = productOrdersService;
	}

	@GetMapping("/productOrders")
	public List<ProductOrders> findAll() {
		return productOrdersService.findAll();
	}

	@PostMapping("/productOrders")
	public void save(ProductOrders productOrders) {
		productOrdersService.save(productOrders);
	}

	@GetMapping("/productOrders{id}")
	public Optional<ProductOrders> findById(@PathVariable Long id) {
		return productOrdersService.findById(id);
	}

	@DeleteMapping("/productOrders{id}")
	public void deleteById(@PathVariable Long id) {
		productOrdersService.deleteById(id);
	}
	
}
