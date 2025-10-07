package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.college.entity.Sponsor;
import com.college.service.SponsorService;

import java.util.List;

@RestController
@RequestMapping("/api/sponsors")
@CrossOrigin(origins = "http://localhost:4200")
public class SponsorController {
    @Autowired
    private SponsorService sponsorService;

    @GetMapping
    public List<Sponsor> getAll() {
        return sponsorService.getAll();
    }

    @PostMapping
    public Sponsor create(@RequestBody Sponsor sponsor) {
        return sponsorService.create(sponsor);
    }

//    @PutMapping("/{id}")
//    public Sponsor update(@RequestBody Sponsor sponsor) {
//        return sponsorService.update(sponsor);
//    }
    @PutMapping("/{id}")
    public Sponsor updateSponsor(@PathVariable Long id, @RequestBody Sponsor updatedSponsor) {
        updatedSponsor.setSponsorId(id); // set the ID from path
        return sponsorService.update(updatedSponsor);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sponsorService.delete(id);
    }
}