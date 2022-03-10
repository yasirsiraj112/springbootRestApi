package com.project.springboot.services.impl;

import com.project.springboot.dtos.StaffDTO;
import com.project.springboot.models.StaffEntity;
import com.project.springboot.repositories.StaffRepository;
import com.project.springboot.services.StaffService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository staffRepository;

	@Transactional
	@Override
	public StaffDTO saveAll(StaffDTO staffDTO){
		StaffEntity staffObj=new StaffEntity();
		BeanUtils.copyProperties(staffDTO, staffObj);
		staffRepository.save(staffObj);
		return staffDTO;
	}

}
