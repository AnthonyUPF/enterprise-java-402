package com.example.Intro.AssociationNurses.repositories;

import com.example.Intro.AssociationNurses.models.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
}
