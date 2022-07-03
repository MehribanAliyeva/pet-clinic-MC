package com.example.petclinic2.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "specialities")

public class Speciality extends BaseEntity implements Serializable {
    @Column(name = "description")
    private String description;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
