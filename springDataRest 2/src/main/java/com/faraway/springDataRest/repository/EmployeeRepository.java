package com.faraway.springDataRest.repository;

import com.faraway.springDataRest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employees",path="employees")
public interface EmployeeRepository  extends JpaRepository<Employee,Long> {

        List<Employee> findByFirstName(@Param("firstName") String firstName);
    }
