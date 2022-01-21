package com.JPA.JPA;

import org.springframework.ui.Model;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{

    private long maxWeight;

    public Van(String plateNumber, String Modele, long maxWeight) {
        super(plateNumber, Modele);
        this.maxWeight= maxWeight;
    }

    public long getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(long maxWeight) {
        this.maxWeight = maxWeight;
    }
}
