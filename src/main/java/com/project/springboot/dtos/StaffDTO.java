package com.project.springboot.dtos;

import lombok.Data;

@Data
public class StaffDTO {
	private Long ID;
    private String staffName;
	private String staffFather;
	private String staffCNIC;
}
