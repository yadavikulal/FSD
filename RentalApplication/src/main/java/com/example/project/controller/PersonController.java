package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Person;
import com.example.project.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {

	PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@GetMapping("/persons")
	public List<Person> findAll() {
		return personService.getAllPersons();
	}

	@PostMapping("/persons")
	public void createPerson(Person person) {
		personService.createPerson(person);
	}

	@GetMapping("/persons{id}")
	public Optional<Person> findById(@PathVariable Long id) {
		return personService.findById(id);
	}

	@DeleteMapping("/persons{id}")
	public void deleteById(@PathVariable Long id) {
		personService.deleteById(id);
	}

}
