package com.project.springboot.controllers;

import com.project.springboot.dtos.EmployeeDTO;
import com.project.springboot.models.EmployeeEntity;
import com.project.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public List<EmployeeEntity> findAll(){
		return employeeService.findAll();
	}

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