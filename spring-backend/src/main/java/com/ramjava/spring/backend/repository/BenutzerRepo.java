package com.ramjava.spring.backend.repository;

import com.ramjava.spring.backend.model.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenutzerRepo extends JpaRepository<Benutzer, Long> {
}
