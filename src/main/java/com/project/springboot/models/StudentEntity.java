package com.project.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@Column(name = "student_name")
	private String studentName;
	@Column(name="father_name")
	private String fatherName;
	@Column(name="roll_no")
	private String rollNo;
	@Column(name = "student_address")
	private String studentAddress;

}
