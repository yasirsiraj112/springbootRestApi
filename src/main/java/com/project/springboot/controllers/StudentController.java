package com.project.springboot.controllers;

import com.project.springboot.dtos.StudentDTO;
import com.project.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    /// Autowired TeacherService class not using JAVA Object method
    @Autowired
    private StudentService studentService;

    /// Create Get Mapping of student
    @GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentDTO getStudent(){
       return studentService.getStudentRecord();
    }

    /// Create Post Mapping of student
    @PostMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentDTO createStudent(){
        return studentService.createStudentRecord();
    }

    ///////// Request Parameters
    ////// http://localhost:1000/student?id=1&name=Kashif
    @RequestMapping(value = "/student/")
    public String getStudentparam(@RequestParam int id, @RequestParam int name){
        return "Student ID: "+id+ " Student Name: "+name;
    }
}
