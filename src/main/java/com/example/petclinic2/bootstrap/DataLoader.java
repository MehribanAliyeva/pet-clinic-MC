package com.example.petclinic2.bootstrap;

import com.example.petclinic2.model.Owner;
import com.example.petclinic2.model.Vet;
import com.example.petclinic2.services.OwnerService;
import com.example.petclinic2.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setSecondName("Weston");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setSecondName("Gallagher");
        ownerService.save(owner2);
        System.out.println("Loaded owners...");
        Vet vet1 = new Vet();
        vet1.setId(4L);
        vet1.setFirstName("Sam");
        vet1.setSecondName("Axe");
        vetService.save(vet1);
        Vet vet2= new Vet();
        vet2.setId(5L);
        vet2.setFirstName("Jesse");
        vet2.setSecondName("Porter");
        vetService.save(vet2);
        System.out.println("Loaded vets...");
    }
}

