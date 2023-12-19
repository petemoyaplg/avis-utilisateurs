package com.plg.avisutilisateurs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plg.avisutilisateurs.models.Utilisateur;
import com.plg.avisutilisateurs.repository.UtilisateurRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UtilisateurService {
  @Autowired
  private UtilisateurRepo utilisateurRepo;

  public void inscription(Utilisateur utilisateur) {
    this.utilisateurRepo.save(utilisateur);
  }
}
