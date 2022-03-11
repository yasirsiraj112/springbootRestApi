package com.project.springboot.services.impl;

import com.project.springboot.dtos.CourseDTO;
import com.project.springboot.models.CourseEntity;
import com.project.springboot.repositories.CourseRepository;
import com.project.springboot.services.CourseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Transactional
	@Override
	public void saveAll(CourseDTO courseDTO) {
		CourseEntity courseObj=new CourseEntity();
		BeanUtils.copyProperties(courseDTO, courseObj);
		courseRepository.save(courseObj);
	}

	@Override
	public List<CourseEntity> findAll() {
		return courseRepository.findAll();
	}

}
