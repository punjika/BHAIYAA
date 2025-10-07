package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.college.entity.Venue;
import com.college.service.VenueService;

import java.util.List;

@RestController
@RequestMapping("/admin/venues")
@CrossOrigin(origins = "http://localhost:4200")
public class VenueController {
    @Autowired
    private VenueService venueService;

    @GetMapping
    public List<Venue> getAll() {
        return venueService.getAll();
    }

    @PostMapping
    public Venue create(@RequestBody Venue venue) {
        return venueService.create(venue);
    }

//    @PutMapping("/{id}")
//    public Venue update(@RequestBody Venue venue) {
//        return venueService.update(venue);
//    }
    @PutMapping("/{id}")
    public Venue updateVenue(@PathVariable Long id, @RequestBody Venue updatedVenue) {
        updatedVenue.setVenueId(id); // Make sure the ID is set correctly
        return venueService.update(updatedVenue);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        venueService.delete(id);
    }
}