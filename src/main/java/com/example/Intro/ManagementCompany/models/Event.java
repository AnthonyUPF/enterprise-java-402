package com.example.Intro.ManagementCompany.models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;

    private String title;

    private Date date;
    private String location;

    @ManyToMany(mappedBy ="eventList")
    private List<Guest> guestList;


    public Event() {
    }




}
