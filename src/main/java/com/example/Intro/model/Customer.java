package com.example.Intro;

import jakarta.persistence.*;


@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    private CustomerStatus status;


    public Customer() {
    }

    public Customer(String name, CustomerStatus status) {
        this.id=id;
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
