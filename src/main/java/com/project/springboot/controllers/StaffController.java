package com.project.springboot.controllers;

import com.project.springboot.dtos.StaffDTO;
import com.project.springboot.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private StaffService staffService;

    /// Create Get Mapping of staff
    @GetMapping(value ="/staff")
    public StaffDTO getStaffRecord(){
        return staffService.getStaffRecord();
    }
}
