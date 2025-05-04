package com.ironhack.labweek7.model;

import com.ironhack.labweek7.model.enums.StatusType;
import jakarta.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flight_number;
    private String aircraft;
    private int total_seats;
    private int flight_mileage;

    //getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public int getFlight_mileage() {
        return flight_mileage;
    }

    public void setFlight_mileage(int flight_mileage) {
        this.flight_mileage = flight_mileage;
    }

    //constructor

    public Flight(String flight_number, String aircraft, int total_seats, int flight_mileage) {
        this.flight_number = flight_number;
        this.aircraft = aircraft;
        this.total_seats = total_seats;
        this.flight_mileage = flight_mileage;
    }


    //empty constructor
    public Flight() {
    }
}
