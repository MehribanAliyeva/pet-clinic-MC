package com.example.petclinic2.model;

import java.security.acl.Owner;
import java.time.LocalDate;

public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate dateOfBirth;


}