package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.entity.ProductOrders;
import com.example.project.repository.ProductOrdersRepository;

@Service
public class ProductOrdersServiceImpl implements ProductOrdersService {

	ProductOrdersRepository productOrdersRepository;
	
	@Autowired
	public ProductOrdersServiceImpl(ProductOrdersRepository productOrdersRepository) {
		super();
		this.productOrdersRepository = productOrdersRepository;
	}

	@Override
	public List<ProductOrders> findAll() {
		// TODO Auto-generated method stub
		return (List<ProductOrders>) productOrdersRepository.findAll();
	}

	@Override
	public void save(ProductOrders productOrders) {
		// TODO Auto-generated method stub
		productOrdersRepository.save(productOrders);
	}

	@Override
	public Optional<ProductOrders> findById(Long id) {
		// TODO Auto-generated method stub
		return productOrdersRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		productOrdersRepository.deleteById(id);
		
	}

}
