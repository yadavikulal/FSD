package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.PersonRoles;
import com.example.project.repository.PersonRolesRepository;

@Service
public class PersonRolesServiceImpl implements PersonRolesService {

	PersonRolesRepository personRolesRepository;
	
	@Autowired
	public PersonRolesServiceImpl(PersonRolesRepository personRolesRepository) {
		super();
		this.personRolesRepository = personRolesRepository;
	}

	@Override
	public List<PersonRoles> findAll() {
		// TODO Auto-generated method stub
		return (List<PersonRoles>) personRolesRepository.findAll();
	}


	@Override
	public Optional<PersonRoles> findById(Long id) {
		// TODO Auto-generated method stub
		return personRolesRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personRolesRepository.deleteById(id);
		
	}

	@Override
	public void save(PersonRoles personRoles) {
		// TODO Auto-generated method stub
		personRolesRepository.save(personRoles);
	}

	

}
