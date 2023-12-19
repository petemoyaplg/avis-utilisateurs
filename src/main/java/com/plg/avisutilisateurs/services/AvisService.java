package com.plg.avisutilisateurs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plg.avisutilisateurs.models.Avis;
import com.plg.avisutilisateurs.repository.AvisRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AvisService {
  @Autowired
  private AvisRepository avisRepository;

  public Avis create(Avis avis) {
    return this.avisRepository.save(avis);
  }
}
