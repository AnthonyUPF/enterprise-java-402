package com.example.Intro.ManagementCompany.repositories;

import com.example.Intro.ManagementCompany.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
