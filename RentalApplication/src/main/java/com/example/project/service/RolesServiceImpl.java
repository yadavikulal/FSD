package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Roles;
import com.example.project.repository.RolesRepository;

@Service
public class RolesServiceImpl implements RolesService {

	RolesRepository rolesRepository;
	
	@Autowired
	public RolesServiceImpl(RolesRepository rolesRepository) {
		super();
		this.rolesRepository = rolesRepository;
	}

	@Override
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		return (List<Roles>) rolesRepository.findAll();
	}

	@Override
	public void save(Roles roles) {
		// TODO Auto-generated method stub
		rolesRepository.save(roles);
	}

	@Override
	public Optional<Roles> findById(Long id) {
		// TODO Auto-generated method stub
		return rolesRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		rolesRepository.deleteById(id);
		
	}

}
