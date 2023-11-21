package com.plg.avisutilisateurs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AvisUtilisateursApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AvisUtilisateursApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Serveur run");
	}

}
