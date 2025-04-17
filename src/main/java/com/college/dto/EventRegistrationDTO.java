package com.college.dto;

public class EventRegistrationDTO {
    private String name;
    private String phone;
    private String email;
    private String college;
    private String branch;
    private Long eventId;

    // Getters and Setters
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

    public Long getEventId() { return eventId; }
    public void setEventId(Long eventId) { this.eventId = eventId; }
}
