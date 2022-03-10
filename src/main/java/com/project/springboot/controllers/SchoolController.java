package com.project.springboot.controllers;

import com.project.springboot.dtos.SchoolDTO;
import com.project.springboot.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private SchoolService schoolService;

	public SchoolDTO saveSchools(@RequestBody SchoolDTO schoolDTO){
		try{
			schoolService.saveAll(schoolDTO);
			return schoolDTO;
		}catch (Exception e){
			return null;
		}
	}


}
