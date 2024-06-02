package com.ramjava.spring.backend.controller;

import com.ramjava.spring.backend.model.Benutzer;
import com.ramjava.spring.backend.repository.BenutzerRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BenutzerController {

    private BenutzerRepo benutzerRepo;

    public BenutzerController(BenutzerRepo benutzerRepo) {
        this.benutzerRepo = benutzerRepo;
    }

    @GetMapping("benutzer")
    public List<Benutzer> getUsers() {
        return this.benutzerRepo.findAll();
    }
}
