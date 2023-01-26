package com.example.Intro.AssociationNurses.repositories;

import com.example.Intro.AssociationNurses.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {
}
