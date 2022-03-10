package com.project.springboot.repositories;

import com.project.springboot.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
	// All Database Task Perform here..
}
