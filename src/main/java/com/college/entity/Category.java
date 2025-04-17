package com.college.entity;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category {
    @Id
    private Long categoryId;
    private String description;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Event> events;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

    // Getters and Setters
}