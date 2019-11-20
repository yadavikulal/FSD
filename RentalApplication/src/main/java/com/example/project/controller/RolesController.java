package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Roles;
import com.example.project.service.RolesService;

@RestController
public class RolesController {

	RolesService rolesService;

	@Autowired
	public RolesController(RolesService rolesService) {
		super();
		this.rolesService = rolesService;
	}

	@GetMapping("/roles")
	public List<Roles> findAll() {
		return rolesService.findAll();
	}

	@PostMapping("/roles")
	public void save(Roles roles) {
		rolesService.save(roles);
	}

	@GetMapping("/roles{id}")
	public Optional<Roles> findById(@PathVariable Long id) {
		return rolesService.findById(id);
	}

	@DeleteMapping("/roles{id}")
	public void deleteById(@PathVariable Long id) {
		rolesService.deleteById(id);
	}
	
}
