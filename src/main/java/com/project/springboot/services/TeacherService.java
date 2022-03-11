package com.project.springboot.services;

import com.project.springboot.dtos.TeacherDTO;
import com.project.springboot.models.TeacherEntity;

import java.util.List;

////// Create TeacherService Interface class
public interface TeacherService {
     // Create function
	void saveAll(TeacherDTO teacherDTO);
	List<TeacherEntity> findAll();
}
