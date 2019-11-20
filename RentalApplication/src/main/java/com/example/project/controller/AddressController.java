package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.project.entity.Address;
import com.example.project.service.AddressService;

public class AddressController {

	AddressService addressService;

	@Autowired
	public AddressController(AddressService addressService) {
		super();
		this.addressService = addressService;
	}

	@GetMapping("/categories")
	public List<Address> findAll() {
		return addressService.findAll();
	}

	@PostMapping("/categories")
	public void createPerson(Address address) {
		addressService.save(address);
	}

	@GetMapping("/categories{id}")
	public Optional<Address> findById(@PathVariable Long id) {
		return addressService.findById(id);
	}

	@DeleteMapping("/categories{id}")
	public void deleteById(@PathVariable Long id) {
		addressService.deleteById(id);
	}
	
}
