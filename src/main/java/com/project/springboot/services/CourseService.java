package com.project.springboot.services;

import com.project.springboot.dtos.CourseDTO;
import com.project.springboot.models.CourseEntity;

import java.util.List;

public interface CourseService {
    void saveAll(CourseDTO courseDTO);
	List<CourseEntity> findAll();
}
