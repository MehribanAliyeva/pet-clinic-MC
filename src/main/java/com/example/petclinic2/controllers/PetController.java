package com.example.petclinic2.controllers;

import com.example.petclinic2.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
    private final PetService petService ;

    public PetController(PetService petService) {
        this.petService = petService;
    }
    @RequestMapping({"/pets","pets/index","pets/index.html"})
    public String listPets(Model model){
        model.addAttribute("pets",petService.findAll());

        return "pets/index";
    }
}
