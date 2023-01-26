package com.example.Intro.ManagementCompany.repositories;

import com.example.Intro.ManagementCompany.models.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferencesRepository extends JpaRepository<Conference,Integer> {
}
