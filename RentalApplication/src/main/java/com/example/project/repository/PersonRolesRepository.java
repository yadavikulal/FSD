package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.project.entity.PersonRoles;

@Repository
public interface PersonRolesRepository extends CrudRepository<PersonRoles, Long> {

}
