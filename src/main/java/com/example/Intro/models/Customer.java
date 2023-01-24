package com.example.Intro.models;

import jakarta.persistence.*;


@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private CustomerStatus status;


    public Customer() {
    }

    public Customer(String name, CustomerStatus status) {
        setName(name);
        setStatus(status);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerStatus getStatus() {
        return status;
    }
}
