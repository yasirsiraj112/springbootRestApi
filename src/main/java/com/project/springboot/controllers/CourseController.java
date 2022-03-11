package com.project.springboot.controllers;

import com.project.springboot.dtos.CourseDTO;
import com.project.springboot.models.CourseEntity;
import com.project.springboot.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/course")
public class CourseController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private CourseService courseService;

	@GetMapping
	public List<CourseEntity> getEmployee(){
		return courseService.findAll();
	}

	@PostMapping
	public CourseDTO saveEmployee(@RequestBody CourseDTO courseDTO){
		try{
			courseService.saveAll(courseDTO);
			return courseDTO;
		}catch (Exception e){
			return null;
		}
	}

}
