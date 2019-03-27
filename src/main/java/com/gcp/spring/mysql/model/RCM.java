package com.gcp.spring.mysql.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "rcm")
public class RCM {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;

    @Column(nullable = false)
    private String speciality;

    @Column(nullable = false)
    private int workYears;

    public RCM(@NotBlank String name, String speciality, int workYears) {
        this.name = name;
        this.speciality = speciality;
        this.workYears = workYears;
    }

    public RCM() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getWorkYears() {
        return workYears;
    }

    public void setWorkYears(int workYears) {
        this.workYears = workYears;
    }

    @Override
    public String toString() {
        return "RCM member " +
                "[id="+ id +
                ", name=" + name
                + ", speciality=" + speciality
                + ", workYears=" + workYears
                + "]";
    }
}
