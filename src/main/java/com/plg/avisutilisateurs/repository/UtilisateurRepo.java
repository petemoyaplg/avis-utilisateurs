package com.plg.avisutilisateurs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plg.avisutilisateurs.models.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer> {

}
