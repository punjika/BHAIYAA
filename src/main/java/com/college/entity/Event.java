package com.college.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String name;
    private String description;
    private LocalTime time; //hh:mm:ss
    private LocalDate date; //yyyy-mm-dd

    @ManyToOne
    private Category category;

    @ManyToOne
    private Sponsor sponsor;

    @ManyToOne
    private Venue venue;
    

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
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

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Sponsor getSponsor() {
		return sponsor;
	}

	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
    // Getters and Setters
    
}
