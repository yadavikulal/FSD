package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Person;
@Repository
public interface PersonReppository extends CrudRepository<Person, Long> {

}
