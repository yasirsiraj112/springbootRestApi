package com.project.springboot.dtos;

public class SchoolDTO {
    /////// Create Database Fields
    private String schoolID;
    private String SchoolName;

    ////// Create Getter and Setter to access from outside of class
    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
}
