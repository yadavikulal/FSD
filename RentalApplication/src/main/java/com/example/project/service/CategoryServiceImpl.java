package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Category;
import com.example.project.repository.CategoryRepository;
@Service
public class CategoryServiceImpl implements CategoryService {

	CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public void save(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
	}

	@Override
	public Optional<Category> findById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
		
	}

}
