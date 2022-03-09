package com.project.springboot.services.impl;

import com.project.springboot.dtos.StudentDTO;
import com.project.springboot.models.StudentEntity;
import com.project.springboot.repositories.StudentRepository;
import com.project.springboot.services.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.HashSet;

/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class StudenServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	@Override
	public void saveAll(StudentDTO studentDTO){
		StudentEntity stdObj=new StudentEntity();
		BeanUtils.copyProperties(studentDTO, stdObj);
		studentRepository.save(stdObj);
	}



    //private static HashSet<StudentDTO> studentDTOS;

    // Implements all functions from studentService Class
    /// Create Object Using DTOS package dtos -> StudentDTO
//    @Override
//    public StudentDTO getStudentRecord() {
//        StudentDTO studentObject=new StudentDTO();
//        studentObject.setsID("1");
//        studentObject.setStudentName("Yasir");
//        return studentObject;
//    }
//
//    @Override
//    public StudentDTO createStudentRecord() {
//        StudentDTO studentObject=new StudentDTO();
//        studentObject.setsID("1");
//        studentObject.setStudentName("Yasir");
//        return studentObject;
//    }


}
