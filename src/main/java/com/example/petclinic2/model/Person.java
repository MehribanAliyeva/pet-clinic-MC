package com.example.petclinic2.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public class Person extends BaseEntity {
    @Column(name = "first_name")

    private String firstName;
    @Column(name = "last_name")
    private String secondName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
