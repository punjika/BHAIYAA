package com.college.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.college.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {}