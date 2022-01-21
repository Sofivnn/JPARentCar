package com.JPA.JPA;


import org.h2.engine.Mode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehicule {

    private  long id;
    private String plateNumber;
    private String Modele;
    List<Rent> rents = new ArrayList<Rent>();

    public Vehicule(String plateNumber, String Modele) {
        this.plateNumber = plateNumber;
        this.Modele = Modele;
    }

    public Vehicule() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String modele) {
        this.Modele = modele;
    }

    @OneToMany(mappedBy = "vehicule")
    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

}
