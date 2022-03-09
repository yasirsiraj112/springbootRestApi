package com.project.springboot.services.impl;

import com.project.springboot.dtos.StudentDTO;
import com.project.springboot.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;

/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class StudenServiceImpl implements StudentService {

    private static HashSet<StudentDTO> studentDTOS;

    // Implements all functions from studentService Class
    /// Create Object Using DTOS package dtos -> StudentDTO
    @Override
    public StudentDTO getStudentRecord() {
        StudentDTO studentObject=new StudentDTO();
        studentObject.setsID("1");
        studentObject.setStudentName("Yasir");
        return studentObject;
    }

    @Override
    public StudentDTO createStudentRecord() {
        StudentDTO studentObject=new StudentDTO();
        studentObject.setsID("1");
        studentObject.setStudentName("Yasir");
        return studentObject;
    }


}
