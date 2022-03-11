package com.project.springboot.services;

import com.project.springboot.dtos.SchoolDTO;
import com.project.springboot.models.SchoolEntity;

import java.util.List;

public interface SchoolService {
    void saveAll(SchoolDTO schoolDTO);
	List<SchoolEntity> findAll();
}
