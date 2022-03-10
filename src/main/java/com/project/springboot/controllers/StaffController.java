package com.project.springboot.controllers;

import com.project.springboot.dtos.StaffDTO;
import com.project.springboot.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private StaffService staffService;

	@PostMapping(value = "/staff")
	public StaffDTO saveStaff(@RequestBody StaffDTO staffDTO){
		try{
			staffService.saveAll(staffDTO);
			return staffDTO;
		}catch (Exception e){
			return null;
		}
	}
}
