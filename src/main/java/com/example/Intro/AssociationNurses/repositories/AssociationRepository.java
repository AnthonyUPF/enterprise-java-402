package com.example.Intro.AssociationNurses.repositories;

import com.example.Intro.AssociationNurses.models.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AssociationRepository extends JpaRepository<Association,Integer> {
}
