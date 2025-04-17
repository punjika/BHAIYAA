package com.college.entity;

import jakarta.persistence.*;

@Entity
public class Venue {
    @Id
    private Long venueId;
    private String location;
    private int capacity;
	public Long getVenueId() {
		return venueId;
	}
	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

    // Getters and Setters
    
}