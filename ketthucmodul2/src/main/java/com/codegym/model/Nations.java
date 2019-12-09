package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name="table_nations")
public class Nations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNation;
    private String nameNation;

    public Nations() {
    }

    public Nations(String nameNation) {
        this.nameNation = nameNation;
    }

    public Long getIdNation() {
        return idNation;
    }

    public void setIdNation(Long idNation) {
        this.idNation = idNation;
    }

    public String getNameNation() {
        return nameNation;
    }

    public void setNameNation(String nameNation) {
        this.nameNation = nameNation;
    }
}
