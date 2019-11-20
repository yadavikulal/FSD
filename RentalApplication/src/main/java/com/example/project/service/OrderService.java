package com.example.project.service;

import java.util.List;
import java.util.Optional;

import com.example.project.entity.Orders;

public interface OrderService {

	public List<Orders> findAll();
	public void save(Orders customerOrders);
	public Optional<Orders> findById(Long id);
	public void deleteById(Long id);
	
}
