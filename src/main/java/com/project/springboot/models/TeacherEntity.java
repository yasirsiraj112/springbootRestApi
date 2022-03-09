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
@Table(name = "teachers")
public class TeacherEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long ID;

	 @Column(name = "teacher_name")
	 private String teacherName;

	 @Column(name = "father_name")
	 private String fatherName;
}
