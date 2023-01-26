package com.example.Intro.ManagementCompany.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Conference extends Event{

    @ManyToMany(mappedBy = "conferenceList")
    private List<Speaker> speakerList;

    public Conference() {
    }
}
