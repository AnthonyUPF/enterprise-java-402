package com.example.Intro.models;

import jakarta.persistence.*;

@Entity
@Table(name="flight")
public class Flight {
    @Id
    @Column(name="number")
    private String number;
    @Column(name="mileage")
    private Long mileage;
    @Column(name="aircraft")
    private String aircraft;

    public Flight() {
    }

    public Flight(String number, Long mileage, String aircraft) {
        setNumber(number);
        setMileage(mileage);
        setAircraft(aircraft);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getNumber() {
        return number;
    }

    public Long getMileage() {
        return mileage;
    }

    public String getAircraft() {
        return aircraft;
    }
}
