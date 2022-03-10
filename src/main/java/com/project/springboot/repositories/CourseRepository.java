package com.project.springboot.repositories;

import com.project.springboot.models.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
	/// All Database Task Perform Here..
}
