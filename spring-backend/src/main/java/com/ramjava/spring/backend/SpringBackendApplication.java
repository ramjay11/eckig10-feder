package com.ramjava.spring.backend;

import com.ramjava.spring.backend.model.Benutzer;
import com.ramjava.spring.backend.repository.BenutzerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}

	@Autowired
	private BenutzerRepo benutzerRepo;

	@Override
	public void run(String...args) throws Exception {
		this.benutzerRepo.save(new Benutzer("Siber", "Saint", "siber@gmail.com"));
		this.benutzerRepo.save(new Benutzer("Doray", "Saint", "doray@gmail.com"));
		this.benutzerRepo.save(new Benutzer("Mowkree", "Saint", "mowkree@gmail.com"));
	}
}
