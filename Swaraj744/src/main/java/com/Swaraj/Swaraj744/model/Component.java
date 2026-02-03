package com.Swaraj.Swaraj744.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    private Double pricePerAcre;
    private Double pricePerPot;

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

    public Double getPricePerAcre() {
        return pricePerAcre;
    }

    public void setPricePerAcre(Double pricePerAcre) {
        this.pricePerAcre = pricePerAcre;
    }

    public Double getPricePerPot() {
        return pricePerPot;
    }

    public void setPricePerPot(Double pricePerPot) {
        this.pricePerPot = pricePerPot;
    }
}
