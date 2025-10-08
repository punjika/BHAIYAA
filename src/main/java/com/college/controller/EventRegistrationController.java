package com.college.controller;

import com.college.dto.EventRegistrationDTO;
import com.college.entity.EventRegistration;
import com.college.service.EventRegistrationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin(origins = "https://*.up.railway.app")
public class EventRegistrationController {

    @Autowired
    private EventRegistrationService registrationService;

    @PostMapping
    public EventRegistration registerUser(@RequestBody EventRegistrationDTO dto) {
        return registrationService.register(dto);
    }
    @GetMapping
    public List<EventRegistration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }
    @GetMapping("/event/{eventId}")
    public List<EventRegistration> getRegistrationsByEventId(@PathVariable Long eventId) {
        return registrationService.getRegistrationsByEventId(eventId);
    }

}
