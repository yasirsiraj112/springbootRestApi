package com.project.springboot.services.impl;

import com.project.springboot.dtos.StaffDTO;
import com.project.springboot.services.StaffService;
import org.springframework.stereotype.Service;
/// implements StudentService class in current class
/// Add Service Annotation to change this class to service
@Service
public class StaffServiceImpl implements StaffService {
    /// Create Object Using DTOS package dtos -> StaffDTO
    @Override
    public StaffDTO getStaffRecord() {
        StaffDTO staffObj= new StaffDTO();
        staffObj.setStaffName("Kashif");
        return staffObj;
    }
}
