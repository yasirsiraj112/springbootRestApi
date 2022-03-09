package com.project.springboot.dtos;

import lombok.Data;

@Data
public class StudentDTO {
    /////// Create Database Fields
    private String ID;
    private String studentName;

    ////// Create Getter and Setter to access from outside of class
}
