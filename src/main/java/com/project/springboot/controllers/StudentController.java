package com.project.springboot.controllers;

import com.project.springboot.dtos.StudentDTO;
import com.project.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private StudentService studentService;

	@PostMapping(value = "/students")
	public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
		try{
			studentService.saveAll(studentDTO);
			return studentDTO;
		}catch(Exception e){
			return null;
		}
	}
}
