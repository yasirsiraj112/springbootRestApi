package com.project.springboot.dtos;

public class CourseDTO {
    /////// Create Database Fields
    private String cID;
    private String courseName;

    ////// Create Getter and Setter to access from outside of class
    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
