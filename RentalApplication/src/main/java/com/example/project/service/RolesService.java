package com.example.project.service;

import java.util.List;
import java.util.Optional;
import com.example.project.entity.Roles;

public interface RolesService {

	public List<Roles> findAll();
	public void save(Roles roles);
	public Optional<Roles> findById(Long id);
	public void deleteById(Long id);
	
}
