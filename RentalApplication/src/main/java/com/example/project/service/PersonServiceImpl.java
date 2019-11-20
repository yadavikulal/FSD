package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Person;
import com.example.project.repository.PersonReppository;

@Service
public class PersonServiceImpl implements PersonService{

	PersonReppository personRepository; 
	
	@Autowired
	public PersonServiceImpl(PersonReppository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public void createPerson(Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);
		
	}

	@Override
	public Optional<Person> findById(Long id) {
		// TODO Auto-generated method stub
		return personRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
		
	}

	
	
}
