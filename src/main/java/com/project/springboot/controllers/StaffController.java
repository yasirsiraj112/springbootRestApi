package com.project.springboot.controllers;

import com.project.springboot.dtos.StaffDTO;
import com.project.springboot.models.StaffEntity;
import com.project.springboot.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/staff")
public class StaffController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private StaffService staffService;

	@GetMapping
	public List<StaffEntity> getAll(){
		return staffService.findAll();
	}

	@PostMapping
	public StaffDTO saveStaff(@RequestBody StaffDTO staffDTO){
		try{
			staffService.saveAll(staffDTO);
			return staffDTO;
		}catch (Exception e){
			return null;
		}
	}
}
