package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Address;
import com.example.project.service.AddressService;

@RestController
public class AddressController {

	AddressService addressService;

	@Autowired
	public AddressController(AddressService addressService) {
		super();
		this.addressService = addressService;
	}

	@GetMapping("/addresses")
	public List<Address> findAll() {
		return addressService.findAll();
	}

	@PostMapping("/addresses")
	public void createPerson(Address address) {
		addressService.save(address);
	}

	@GetMapping("/addresses{id}")
	public Optional<Address> findById(@PathVariable Long id) {
		return addressService.findById(id);
	}

	@DeleteMapping("/addresses{id}")
	public void deleteById(@PathVariable Long id) {
		addressService.deleteById(id);
	}
	
}
