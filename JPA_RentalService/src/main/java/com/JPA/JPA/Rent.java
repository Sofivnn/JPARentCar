package com.JPA.JPA;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Rent {

    long id;
    Person person;
    Vehicule vehicule;
    private String beginRent;
    private String endRent;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JsonIgnore
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    public Vehicule getVehicule(){
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }


    public String getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(String beginRent) {
        this.beginRent = beginRent;
    }

    public String getEndRent() {
        return endRent;
    }

    public void setEndRent(String endRent) {
        this.endRent = endRent;
    }

}