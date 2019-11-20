package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Orders;
@Repository
public interface CustomerOrdersRepository extends CrudRepository<Orders, Long> {

}
