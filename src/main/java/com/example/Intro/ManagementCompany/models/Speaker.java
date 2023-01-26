package com.example.Intro.ManagementCompany.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer speakerId;

    private String speakerName;
    private double presentationDuration;

    @ManyToMany
    private List<Conference> conferenceList;

    public Speaker() {
    }
}
