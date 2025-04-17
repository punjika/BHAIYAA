package com.college.dto;

public class EventFeedbackDTO {
    private String name;
    private String email;
    private String comments;

    // Constructors
    public EventFeedbackDTO() {}

    public EventFeedbackDTO(String name, String email, String comments) {
        this.name = name;
        this.email = email;
        this.comments = comments;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
}
