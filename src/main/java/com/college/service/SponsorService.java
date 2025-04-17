package com.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Sponsor;
import com.college.repository.SponsorRepository;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    private SponsorRepository sponsorRepository;

    public List<Sponsor> getAll() {
        return sponsorRepository.findAll();
    }

    public Sponsor create(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

    public void delete(Long id) {
        sponsorRepository.deleteById(id);
    }

    public Sponsor update(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }
}