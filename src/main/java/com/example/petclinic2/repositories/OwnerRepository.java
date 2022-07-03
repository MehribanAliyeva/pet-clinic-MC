package com.example.petclinic2.repositories;

import com.example.petclinic2.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
   public Owner findByLastName(String lastName);


}
