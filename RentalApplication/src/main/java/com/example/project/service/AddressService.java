package com.example.project.service;

import java.util.List;
import java.util.Optional;

import com.example.project.entity.Address;

public interface AddressService {

	public List<Address> findAll();
	public void save(Address address);
	public Optional<Address> findById(Long id);
	public void deleteById(Long id);
	
}
