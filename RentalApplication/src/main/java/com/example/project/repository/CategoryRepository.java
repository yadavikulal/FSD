package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.project.entity.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
