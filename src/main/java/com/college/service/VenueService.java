package com.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Venue;
import com.college.repository.VenueRepository;

import java.util.List;

@Service
public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public List<Venue> getAll() {
        return venueRepository.findAll();
    }

    public Venue create(Venue venue) {
        return venueRepository.save(venue);
    }

    public void delete(Long id) {
        venueRepository.deleteById(id);
    }

    public Venue update(Venue venue) {
        return venueRepository.save(venue);
    }
}

