package com.project.springboot.repositories;

import com.project.springboot.models.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
	 //// All Database Task Perform Here
}
