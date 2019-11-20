package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
