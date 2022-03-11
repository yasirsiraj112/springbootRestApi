package com.project.springboot.services.impl;

import com.project.springboot.dtos.SchoolDTO;
import com.project.springboot.models.SchoolEntity;
import com.project.springboot.repositories.SchoolRepository;
import com.project.springboot.services.SchoolService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class SchoolServiceImpl implements SchoolService {
    /// Create Object Using DTOS package dtos -> SchoolDTO

	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public List<SchoolEntity> findAll(){
		return schoolRepository.findAll();
	}

	@Transactional
	@Override
	public void saveAll(SchoolDTO schoolDTO){
		SchoolEntity schoolObj= new SchoolEntity();
		BeanUtils.copyProperties(schoolDTO, schoolObj);
		schoolRepository.save(schoolObj);
	}
}
