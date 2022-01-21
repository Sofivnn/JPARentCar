package com.JPA.JPA;

import org.h2.engine.Mode;
import org.springframework.ui.Model;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule{

    private int numberOfSeats;

    public Car(String plateNumber, String Modele, int numberOfSeats) {
        super(plateNumber, Modele);
        this.numberOfSeats=numberOfSeats;
    }


    public Car() {
        super();
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
