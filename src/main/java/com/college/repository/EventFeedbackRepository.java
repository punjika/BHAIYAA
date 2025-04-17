package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.entity.EventFeedback;

public interface EventFeedbackRepository extends JpaRepository<EventFeedback, Long> {
	
}
