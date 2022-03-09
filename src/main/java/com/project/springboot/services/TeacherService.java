package com.project.springboot.services;

import com.project.springboot.dtos.TeacherDTO;

////// Create TeacherService Interface class
public interface TeacherService {
     // Create function
    public TeacherDTO getTecherRecord();
	public void saveAll(TeacherDTO teacherDTO);
}
