package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Products;
@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {

}
