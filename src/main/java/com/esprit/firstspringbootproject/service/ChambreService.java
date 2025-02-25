package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    IChambreRepository chambreRepo;

    @Override
    public Chambre addChambre(Chambre ch) {
        return chambreRepo.save(ch);
    }

    @Override
    public Chambre removeChambre(Chambre ch) {
        chambreRepo.delete(ch);
        return null;
    }
}