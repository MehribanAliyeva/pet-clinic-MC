package com.example.petclinic2.services;

import com.example.petclinic2.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}

