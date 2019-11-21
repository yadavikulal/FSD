package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Category;
import com.example.project.service.CategoryService;

@RestController
public class CategoryController {

	CategoryService categoryService;

	@Autowired
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

	@GetMapping("/categories")
	public List<Category> findAll() {
		return categoryService.findAll();
	}

	@PostMapping("/categories")
	public void createPerson(Category category) {
		categoryService.save(category);
	}

	@GetMapping("/categories{id}")
	public Optional<Category> findById(@PathVariable Long id) {
		return categoryService.findById(id);
	}

	@DeleteMapping("/categories{id}")
	public void deleteById(@PathVariable Long id) {
		categoryService.deleteById(id);
	}
	
}
