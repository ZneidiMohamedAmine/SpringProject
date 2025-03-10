package com.esprit.firstspringbootproject.controller;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.entities.Universite;
import com.esprit.firstspringbootproject.service.IBlocService;
import com.esprit.firstspringbootproject.service.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite uni) {
        return universiteService.addUniversite(uni);
    }

    @DeleteMapping("/delete-universite")
    public Universite deleteUniversite(@RequestBody Universite uni) {
        universiteService.removeUniversite(uni);
        return null;
    }

    @PutMapping("/affecter-foyer/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(@PathVariable long idFoyer, @PathVariable String nomUniversite) {
        return universiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }
}

