package com.example.petclinic2.repositories;

import com.example.petclinic2.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {


}
