package com.project.springboot.services;

import com.project.springboot.dtos.EmployeeDTO;
import com.project.springboot.models.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
	void saveAll(EmployeeDTO employeeDTO);
	List<EmployeeEntity> findAll();
}
