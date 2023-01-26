package com.example.Intro.AssociationNurses.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAssociation;

    private String name;

    @OneToMany(mappedBy = "association")
    private List<Chapter> chaptersList;


    public Association() {
    }

    public Association(String name, List<Chapter> chapters) {
        this.name = name;
        this.chaptersList = chapters;
    }
}
