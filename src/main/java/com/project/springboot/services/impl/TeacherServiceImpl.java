package com.project.springboot.services.impl;

import com.project.springboot.dtos.TeacherDTO;
import com.project.springboot.models.EmployeeEntity;
import com.project.springboot.models.TeacherEntity;
import com.project.springboot.repositories.TeacherRepository;
import com.project.springboot.services.TeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/// Implements teacher service class in Implement class
@Service
public class TeacherServiceImpl implements TeacherService {

	/// Repository
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public List<TeacherEntity> findAll(){
		return teacherRepository.findAll();
	}

	@Transactional
	@Override
	public void saveAll(TeacherDTO teacherDTO){
		TeacherEntity thrObj=new TeacherEntity();
		BeanUtils.copyProperties(teacherDTO, thrObj);
		teacherRepository.save(thrObj);

	}
}
