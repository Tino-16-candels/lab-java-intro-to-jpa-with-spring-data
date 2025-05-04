package com.ironhack.labweek7.model;

import com.ironhack.labweek7.model.enums.StatusType;
import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int total_mileage;

   //qui vanno gli enum
    @Enumerated(EnumType.ORDINAL)
    private StatusType statusType;

    //getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_mileage() {
        return total_mileage;
    }

    public void setTotal_mileage(int total_mileage) {
        this.total_mileage = total_mileage;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }

    //constructor

    public Customer(String name, StatusType statusType, int total_mileage) {
        this.name = name;
        this.total_mileage = total_mileage;
        this.statusType = statusType;
    }

    //empty constructor
    public Customer() {
    }
}
