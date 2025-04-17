package com.college.service;

import com.college.dto.EventRegistrationDTO;
import com.college.entity.Event;
import com.college.entity.EventRegistration;
import com.college.repository.EventRegistrationRepository;
import com.college.repository.EventRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRegistrationService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventRegistrationRepository registrationRepository;

    public EventRegistration register(EventRegistrationDTO dto) {
        Event event = eventRepository.findById(dto.getEventId())
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + dto.getEventId()));

        EventRegistration registration = new EventRegistration();
        registration.setName(dto.getName());
        registration.setPhone(dto.getPhone());
        registration.setEmail(dto.getEmail());
        registration.setCollege(dto.getCollege());
        registration.setBranch(dto.getBranch());
        registration.setEvent(event); // link event here

        return registrationRepository.save(registration);
    }
    public List<EventRegistration> getAllRegistrations() {
        return registrationRepository.findAll();
    }
    public List<EventRegistration> getRegistrationsByEventId(Long eventId) {
        return registrationRepository.findByEventEventId(eventId);
    }

}
