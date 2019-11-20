package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Address;
import com.example.project.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	AddressRepository addressRepository;
	
	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public void save(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
	}

	@Override
	public Optional<Address> findById(Long id) {
		// TODO Auto-generated method stub
		return addressRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		addressRepository.deleteById(id);
		
	}

}
