package com.project.springboot.services.impl;

import com.project.springboot.dtos.StudentDTO;
import com.project.springboot.models.StaffEntity;
import com.project.springboot.models.StudentEntity;
import com.project.springboot.repositories.StudentRepository;
import com.project.springboot.services.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class StudenServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<StudentEntity> findAll(){
		return studentRepository.findAll();
	}

	@Transactional
	@Override
	public void saveAll(StudentDTO studentDTO){
		StudentEntity stdObj=new StudentEntity();
		BeanUtils.copyProperties(studentDTO, stdObj);
		studentRepository.save(stdObj);
	}

}
