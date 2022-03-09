package com.project.springboot.services;
import com.project.springboot.dtos.StudentDTO;


////// Create TeacherService Interface class
public interface StudentService {
    // Create 2 functions
    public StudentDTO getStudentRecord();
    public StudentDTO createStudentRecord();
}
