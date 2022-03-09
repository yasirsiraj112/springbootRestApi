package com.project.springboot.services.impl;

import com.project.springboot.dtos.TeacherDTO;
import com.project.springboot.models.EmployeeEntity;
import com.project.springboot.models.TeacherEntity;
import com.project.springboot.repositories.TeacherRepository;
import com.project.springboot.services.TeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/// Implements teacher service class in Implement class
@Service
public class TeacherServiceImpl implements TeacherService {

	/// Repository
	@Autowired
	private TeacherRepository teacherRepository;

    /// Create Object Using DTOS package dtos -> TeacherDTO
//    @Override
//    public TeacherDTO getTecherRecord() {
//        TeacherDTO teacherObj=new TeacherDTO();
//        teacherObj.settID("1");
//        teacherObj.setTeacherName("Sir Ibrar");
//        return teacherObj;
//    }

	@Override
	public TeacherDTO getTecherRecord() {
		return null;
	}

	@Override
	public void saveAll(TeacherDTO teacherDTO){
		TeacherEntity thrObj=new TeacherEntity();
		BeanUtils.copyProperties(teacherDTO, thrObj);
		teacherRepository.save(thrObj);

	}
}
