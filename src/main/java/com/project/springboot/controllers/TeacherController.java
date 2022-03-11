package com.project.springboot.controllers;

import com.project.springboot.dtos.TeacherDTO;
import com.project.springboot.models.TeacherEntity;
import com.project.springboot.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/teacher")
public class TeacherController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private TeacherService teacherService;

	@GetMapping
	public List<TeacherEntity> getAll(){
		return teacherService.findAll();
	}

	@PostMapping
	public TeacherDTO saveAll(@RequestBody TeacherDTO teacherDTO){
		try{
			teacherService.saveAll(teacherDTO);
			return teacherDTO;
		}
		catch (Exception exception){
			return null;
		}
	}
}
