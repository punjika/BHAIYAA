package com.college.controller;

import com.college.dto.EventFeedbackDTO;
import com.college.entity.EventFeedback;
import com.college.service.EventFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.*;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "https://*.up.railway.app")
public class EventFeedbackController {

    @Autowired
    private EventFeedbackService feedbackService;

    @PostMapping
    public ResponseEntity<Map<String, String>> submitFeedback(@RequestBody EventFeedbackDTO dto) {
        feedbackService.saveFeedback(dto);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Feedback submitted successfully.");

        return ResponseEntity.ok(response);
    }


    @GetMapping
    public ResponseEntity<List<EventFeedback>> getAllFeedback() {
        return ResponseEntity.ok(feedbackService.getAllFeedback());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        feedbackService.delete(id);
    }
}
