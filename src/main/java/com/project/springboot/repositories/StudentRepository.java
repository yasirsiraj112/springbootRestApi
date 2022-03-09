package com.project.springboot.repositories;

import com.project.springboot.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
	// All Database Task Perform here..
}
