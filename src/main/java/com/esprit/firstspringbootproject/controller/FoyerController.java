package com.esprit.firstspringbootproject.controller;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.entities.Foyer;
import com.esprit.firstspringbootproject.service.IBlocService;
import com.esprit.firstspringbootproject.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    IFoyerService foyerService;

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer fo) {
        return foyerService.addFoyer(fo);
    }

    @DeleteMapping("/delete-foyer")
    public Foyer deleteFoyer(@RequestBody Foyer fo) {
        foyerService.removeFoyer(fo);
        return null;
    }
}

