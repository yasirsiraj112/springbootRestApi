package com.project.springboot.services;
import com.project.springboot.dtos.StudentDTO;
import com.project.springboot.models.StudentEntity;

import java.util.List;


////// Create TeacherService Interface class
public interface StudentService {
    // Create 2 functions
	void saveAll(StudentDTO studentDTO);
	List<StudentEntity> findAll();
}
