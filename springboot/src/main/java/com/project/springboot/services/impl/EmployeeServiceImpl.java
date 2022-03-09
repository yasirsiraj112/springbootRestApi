package com.project.springboot.services.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.project.springboot.dtos.EmployeeDTO;
import com.project.springboot.models.EmployeeEntity;
import com.project.springboot.repositories.EmployeeRepository;
import com.project.springboot.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	@Override
	public void saveAll(EmployeeDTO employeeDTO) {
		EmployeeEntity objEmp=new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, objEmp);
		employeeRepository.save(objEmp);

	}
}
