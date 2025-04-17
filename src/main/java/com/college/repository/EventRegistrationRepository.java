package com.college.repository;

import com.college.entity.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

	public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Long> {
		List<EventRegistration> findByEventEventId(Long eventId);
		
	}
	


