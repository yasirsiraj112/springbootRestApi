package com.project.springboot.services.impl;

import com.project.springboot.dtos.CourseDTO;
import com.project.springboot.services.CourseService;
import org.springframework.stereotype.Service;
/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class CourseServiceImpl implements CourseService {
    /// Create Object Using DTOS package dtos -> CourseDTO
    @Override
    public CourseDTO getCourseRecord() {
        CourseDTO courseObj=new CourseDTO();
        courseObj.setcID("1");
        courseObj.setCourseName("Physics");
        return courseObj;
    }
}
