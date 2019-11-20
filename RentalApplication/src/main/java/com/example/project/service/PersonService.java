package com.example.project.service;

import java.util.List;
import java.util.Optional;

import com.example.project.entity.Person;

public interface PersonService {
	
	public List<Person> getAllPersons();
	public void createPerson(Person person);
	public Optional<Person> findById(Long id);
	public void deleteById(Long id);

}
