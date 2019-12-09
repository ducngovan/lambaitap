package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "table_citys")
public class Citys {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCity;

    private String nameCity;
    private double acreage;
    private double population;
    private double GDP;
    private String description;

    public Citys() {
    }

    public Citys(String nameCity, double acreage, double population, double GDP, String description) {
        this.nameCity = nameCity;
        this.acreage = acreage;
        this.population = population;
        this.GDP = GDP;
        this.description = description;
    }

    public Long getIdCity() {
        return idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
