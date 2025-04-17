package com.college.service;

import com.college.dto.EventFeedbackDTO;
import com.college.entity.EventFeedback;
import com.college.repository.EventFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventFeedbackService {

    @Autowired
    private EventFeedbackRepository feedbackRepo;

    public void saveFeedback(EventFeedbackDTO dto) {
        EventFeedback feedback = new EventFeedback();
        feedback.setName(dto.getName());
        feedback.setEmail(dto.getEmail());
        feedback.setComments(dto.getComments());
        feedbackRepo.save(feedback);
    }

    public List<EventFeedback> getAllFeedback() {
        return feedbackRepo.findAll();
    }
    public void delete(Long id) {
        feedbackRepo.deleteById(id);
    }
}
