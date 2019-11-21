package com.example.project.service;

import java.util.List;
import java.util.Optional;
import com.example.project.entity.PersonRoles;

public interface PersonRolesService {

	public List<PersonRoles> findAll();
	public void save(PersonRoles personRoles);
	public Optional<PersonRoles> findById(Long id);
	public void deleteById(Long id);
	
}
