package com.project.springboot.dtos;

public class StaffDTO {
    /////// Create Database Fields
    private String staffName;

    ////// Create Getter and Setter to access from outside of class
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
}
