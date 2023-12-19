package com.plg.avisutilisateurs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plg.avisutilisateurs.models.Utilisateur;
import com.plg.avisutilisateurs.security.UtilisateurService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class UtilisateurController {

  @Autowired
  private UtilisateurService utilisateurService;

  @PostMapping(path = "inscription")
  public void inscription(@RequestBody Utilisateur utilisateur) {
    log.info("INSCRIPTION");
    this.utilisateurService.inscription(utilisateur);
  }
}
