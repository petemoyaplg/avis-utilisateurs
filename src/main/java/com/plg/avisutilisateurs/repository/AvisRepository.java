package com.plg.avisutilisateurs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plg.avisutilisateurs.models.Avis;
import java.util.UUID;

public interface AvisRepository extends JpaRepository<Avis, UUID> {

}
