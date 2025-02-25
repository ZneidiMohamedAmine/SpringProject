package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    IFoyerRepository foyerRepo;

    @Override
    public Foyer addFoyer(Foyer fo) {
        return foyerRepo.save(fo);
    }

    @Override
    public Foyer removeFoyer(Foyer fo) {
        foyerRepo.delete(fo);
        return null;
    }
}
