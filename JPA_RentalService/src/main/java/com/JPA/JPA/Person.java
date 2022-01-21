package com.JPA.JPA;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    long id;
    String Nom;
    String Prenom;
    List<Rent> rents = new ArrayList<Rent>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }
}