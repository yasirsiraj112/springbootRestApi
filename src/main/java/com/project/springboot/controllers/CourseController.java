package com.project.springboot.controllers;

import com.project.springboot.dtos.CourseDTO;
import com.project.springboot.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private CourseService courseService;

	@PostMapping(value = "/course")
	public CourseDTO saveEmployee(@RequestBody CourseDTO courseDTO){
		try{
			courseService.saveAll(courseDTO);
			return courseDTO;
		}catch (Exception e){
			return null;
		}
	}

}
