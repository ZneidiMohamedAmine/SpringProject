package com.esprit.firstspringbootproject.controller;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.entities.Chambre;
import com.esprit.firstspringbootproject.service.IBlocService;
import com.esprit.firstspringbootproject.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre ch) {
        return chambreService.addChambre(ch);
    }

    @DeleteMapping("/delete-chambre")
    public Chambre deleteChambre(@RequestBody Chambre ch) {
        chambreService.removeChambre(ch);
        return null;
    }
}
