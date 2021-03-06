package com.project.springboot.controllers;

import com.project.springboot.dtos.StudentDTO;
import com.project.springboot.models.StudentEntity;
import com.project.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private StudentService studentService;

	@GetMapping
	public List<StudentEntity> getAll(){
		return studentService.findAll();
	}

	@PostMapping
	public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
		try{
			studentService.saveAll(studentDTO);
			return studentDTO;
		}catch(Exception e){
			return null;
		}
	}
}
