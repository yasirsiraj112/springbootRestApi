package com.project.springboot.dtos;

public class StudentDTO {
    /////// Create Database Fields
    private String sID;
    private String studentName;

    ////// Create Getter and Setter to access from outside of class
    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
