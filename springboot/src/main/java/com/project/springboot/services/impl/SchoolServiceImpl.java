package com.project.springboot.services.impl;

import com.project.springboot.dtos.SchoolDTO;
import com.project.springboot.services.SchoolService;
import org.springframework.stereotype.Service;
/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class SchoolServiceImpl implements SchoolService {
    /// Create Object Using DTOS package dtos -> SchoolDTO
    @Override
    public SchoolDTO getSchoolRecord() {
        SchoolDTO schoolObj=new SchoolDTO();
        schoolObj.setSchoolID("1");
        schoolObj.setSchoolName("Laureate");
        return schoolObj;
    }
}
