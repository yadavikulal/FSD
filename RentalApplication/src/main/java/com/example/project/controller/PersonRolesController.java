package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.PersonRoles;
import com.example.project.service.PersonRolesService;

@RestController
public class PersonRolesController {

	PersonRolesService personRolesService;

	@Autowired
	public PersonRolesController(PersonRolesService personRolesService) {
		super();
		this.personRolesService = personRolesService;
	}

	@GetMapping("/personRoles")
	public List<PersonRoles> findAll() {
		return personRolesService.findAll();
	}

	@PostMapping("/personRoles")
	public void createPerson(PersonRoles personRoles) {
		personRolesService.save(personRoles);
	}

	@GetMapping("/personRoles{id}")
	public Optional<PersonRoles> findById(@PathVariable Long id) {
		return personRolesService.findById(id);
	}

	@DeleteMapping("/personRoles{id}")
	public void deleteById(@PathVariable Long id) {
		personRolesService.deleteById(id);
	}
	
}
