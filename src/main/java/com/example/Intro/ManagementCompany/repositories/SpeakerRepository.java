package com.example.Intro.ManagementCompany.repositories;

import com.example.Intro.ManagementCompany.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Integer> {
}
