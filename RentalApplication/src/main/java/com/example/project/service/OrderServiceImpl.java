package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Orders;
import com.example.project.repository.CustomerOrdersRepository;

@Service
public class OrderServiceImpl implements OrderService {

	CustomerOrdersRepository customerOrdersRepository;
	
	@Autowired
	public OrderServiceImpl(CustomerOrdersRepository customerOrdersRepository) {
		super();
		this.customerOrdersRepository = customerOrdersRepository;
	}

	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return (List<Orders>) customerOrdersRepository.findAll();
	}

	@Override
	public void save(Orders customerOrders) {
		// TODO Auto-generated method stub
		customerOrdersRepository.save(customerOrders);
	}

	@Override
	public Optional<Orders> findById(Long id) {
		// TODO Auto-generated method stub
		return customerOrdersRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		customerOrdersRepository.deleteById(id);
		
	}

}
