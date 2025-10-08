package com.college.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.college.entity.Event;
import com.college.service.EventService;

import java.util.List;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://*.up.railway.app")
@RequestMapping("/api/events")
public class EventController {
    private static final Logger logger = LoggerFactory.getLogger(EventController.class);

    @Autowired
    private EventService eventService;

    @GetMapping
    @Operation(summary = "Get all events")
    public List<Event> getAllEvents() {
        logger.info("Fetching all events");
        return eventService.getAllEvents();
    }

    @GetMapping("/category/{categoryId}")
    public List<Event> getByCategory(@PathVariable Long categoryId) {
        return eventService.getEventsByCategory(categoryId);
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        logger.info("Creating event: {}", event.getName());
        return eventService.createEvent(event);
    }

//    @PutMapping
//    public Event updateEvent(@RequestBody Event event) {
//        logger.info("Updating event ID: {}", event.getEventId());
//        return eventService.updateEvent(event);
    //}
    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent) {
    	logger.info("Updating event ID: {}",updatedEvent.getEventId());
        return eventService.updateEvent(updatedEvent);
    }


    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        logger.info("Deleting event ID: {}", id);
        eventService.deleteEvent(id);
    }
}
