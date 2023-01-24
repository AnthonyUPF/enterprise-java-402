package com.example.Intro.model;


import jakarta.persistence.*;

@Entity
@Table(name="aircraft")
public class Aircraft {
    @Id
    @Column(name = "model")
    private String model;

    @Column(name="seats")
    private int seats;

    public Aircraft() {
    }

    public Aircraft(String model, int seats) {
        setModel(model);
        setSeats(seats);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }
}
