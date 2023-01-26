package com.example.Intro.ManagementCompany.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guestId;

    private String guestName;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany
    List<Event> eventList;

    public Guest() {
    }
}
