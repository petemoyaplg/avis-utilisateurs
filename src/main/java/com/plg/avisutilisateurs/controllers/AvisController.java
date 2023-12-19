package com.plg.avisutilisateurs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.plg.avisutilisateurs.models.Avis;
import com.plg.avisutilisateurs.services.AvisService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(path = "avis")
public class AvisController {

  @Autowired
  private AvisService avisService;

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping(path = "create")
  public Avis create(@RequestBody Avis avis) {
    return this.avisService.create(avis);
  }
}
