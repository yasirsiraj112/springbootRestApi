package com.project.springboot.controllers;

import com.project.springboot.dtos.TeacherDTO;
import com.project.springboot.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private TeacherService teacherService;

    /// Create Get Mapping of Teacher
//    @GetMapping(value = "/teacher", produces = MediaType.APPLICATION_JSON_VALUE)
//    public TeacherDTO getTeacherRecord(){
//        // Return Service Get Teacher Record Method which defined in Course Serivce Class
//        return teacherService.getTecherRecord();
//    }

	@PostMapping(value = "/teacher")
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
