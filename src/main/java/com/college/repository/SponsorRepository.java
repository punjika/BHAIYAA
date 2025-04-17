package com.college.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.college.entity.Sponsor;

public interface SponsorRepository extends JpaRepository<Sponsor, Long> {}