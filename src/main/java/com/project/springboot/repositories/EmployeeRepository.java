package com.project.springboot.repositories;


import com.project.springboot.models.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	////////Here defined All SQL Functions
}
