package com.project.springboot.repositories;

import com.project.springboot.models.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long> {
	/// All Database Task Perform Here...
}
