package com.project.springboot.services;

import com.project.springboot.dtos.StaffDTO;
import com.project.springboot.models.StaffEntity;

import java.util.List;

public interface StaffService {
    StaffDTO saveAll(StaffDTO staffDTO);
	List<StaffEntity> findAll();
}
