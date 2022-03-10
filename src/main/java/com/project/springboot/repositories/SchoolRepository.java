package com.project.springboot.repositories;

import com.project.springboot.models.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolEntity, Long> {
	// All Task Perform here related to SQL
}
