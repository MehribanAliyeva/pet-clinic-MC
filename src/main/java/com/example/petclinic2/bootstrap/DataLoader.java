package com.example.petclinic2.bootstrap;

import com.example.petclinic2.model.Owner;
import com.example.petclinic2.model.Pet;
import com.example.petclinic2.model.PetType;
import com.example.petclinic2.model.Vet;
import com.example.petclinic2.services.OwnerService;
import com.example.petclinic2.services.PetTypeService;
import com.example.petclinic2.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);
        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);
        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setSecondName("Weston");
        owner1.setAddress("123 Btdgs");
        owner1.setCity("Miami");
        owner1.setTelephone("3454343243");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setDateOfBirth(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);
        Owner owner2 = new Owner();

        owner2.setFirstName("Fiona");
        owner2.setSecondName("Gallagher");
        owner2.setAddress("123 Btdgs");
        owner2.setCity("Miami");
        owner2.setTelephone("3455553243");
        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setDateOfBirth(LocalDate.now());
        fionasCat.setName("Milli");
        owner2.getPets().add(fionasCat);
        ownerService.save(owner2);
        System.out.println("Loaded owners...");
        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setSecondName("Axe");
        vetService.save(vet1);
        Vet vet2= new Vet();

        vet2.setFirstName("Jesse");
        vet2.setSecondName("Porter");
        vetService.save(vet2);
        System.out.println("Loaded vets...");
    }
}

