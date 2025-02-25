package com.esprit.firstspringbootproject.controller;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.entities.Etudiant;
import com.esprit.firstspringbootproject.service.IBlocService;
import com.esprit.firstspringbootproject.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant et) {
        return etudiantService.addEtudiant(et);
    }

    @DeleteMapping("/delete-etudiant")
    public Etudiant deleteEtudiant(@RequestBody Etudiant et) {
        etudiantService.removeEtudiant(et);
        return null;
    }
}
