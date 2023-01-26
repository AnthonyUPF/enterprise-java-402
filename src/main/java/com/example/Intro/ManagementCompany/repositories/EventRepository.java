package com.example.Intro.ManagementCompany.repositories;

import com.example.Intro.ManagementCompany.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {
}
