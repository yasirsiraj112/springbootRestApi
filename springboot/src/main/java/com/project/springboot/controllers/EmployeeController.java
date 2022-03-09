package com.project.springboot.controllers;

import com.project.springboot.dtos.EmployeeDTO;
import com.project.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO){
		try{
			employeeService.saveAll(employeeDTO);
			return employeeDTO;
		}
		catch(Exception e){
			return null;
		}
	}
}