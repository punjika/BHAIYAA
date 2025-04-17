package com.college.entity;

import jakarta.persistence.*;

@Entity
public class EventRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String college;
    private String branch;

    @ManyToOne
    private Event event;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCollege() { return college; }
    public void setCollege(String college) { this.college = college; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }
}
