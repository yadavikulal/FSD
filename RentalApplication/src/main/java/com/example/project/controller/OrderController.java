package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.project.entity.Orders;
import com.example.project.service.OrderService;

public class OrderController {
	OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@GetMapping("/orders")
	public List<Orders> findAll() {
		return orderService.findAll();
	}

	@PostMapping("/orders")
	public void createPerson(Orders customerOrders) {
		orderService.save(customerOrders);
	}

	@GetMapping("/orders{id}")
	public Optional<Orders> findById(@PathVariable Long id) {
		return orderService.findById(id);
	}

	@DeleteMapping("/orders{id}")
	public void deleteById(@PathVariable Long id) {
		orderService.deleteById(id);
	}

}
