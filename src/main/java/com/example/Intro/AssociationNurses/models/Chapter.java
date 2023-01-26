package com.example.Intro.AssociationNurses.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chapterId;

    private String name;
    private String district;

    @ManyToOne
    private Member president;

    @ManyToOne
    private Association association;

    @ManyToMany(mappedBy = "chapters")
    private List<Member> membersList;

    public Chapter() {
    }

    public Chapter(String name, String district, Member president, List<Member> membersList) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.membersList = membersList;
    }
}
