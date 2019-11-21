package com.example.project.service;

import java.util.List;
import java.util.Optional;
import com.example.project.entity.ProductOrders;

public interface ProductOrdersService {

	public List<ProductOrders> findAll();
	public void save(ProductOrders productOrders);
	public Optional<ProductOrders> findById(Long id);
	public void deleteById(Long id);
	
}
