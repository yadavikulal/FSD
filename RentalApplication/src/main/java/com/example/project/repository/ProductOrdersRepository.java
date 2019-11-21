package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.project.entity.ProductOrders;;

@Repository
public interface ProductOrdersRepository extends CrudRepository<ProductOrders, Long> {

}
