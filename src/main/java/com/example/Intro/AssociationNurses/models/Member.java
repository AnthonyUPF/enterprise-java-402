package com.example.Intro.AssociationNurses.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;
    private Date renewalDate;

    @ManyToMany
    @JoinTable(name = "member_chapter",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "chapter_id"))
    private List<Chapter> chapters;

    public Member() {
    }

    public Member(String name, Status status, Date renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }
}
