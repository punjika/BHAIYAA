package com.college.entity;

import jakarta.persistence.*;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sponsorId;
    private String name;
    private String description;
	public Long getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(Long sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    // Getters and Setters
    
}
