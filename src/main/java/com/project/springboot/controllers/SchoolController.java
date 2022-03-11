package com.project.springboot.controllers;

import com.project.springboot.dtos.SchoolDTO;
import com.project.springboot.models.SchoolEntity;
import com.project.springboot.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/school")
public class SchoolController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private SchoolService schoolService;

	@GetMapping
	public List<SchoolEntity> getAll(){
		return schoolService.findAll();
	}

	@PostMapping
	public SchoolDTO saveSchools(@RequestBody SchoolDTO schoolDTO){
		try{
			schoolService.saveAll(schoolDTO);
			return schoolDTO;
		}catch (Exception e){
			return null;
		}
	}


}
