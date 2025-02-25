package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    IUniversiteRepository universiteRepo;

    @Override
    public Universite addUniversite(Universite uni) {
        return universiteRepo.save(uni);
    }

    @Override
    public Universite removeUniversite(Universite uni) {
        universiteRepo.delete(uni);
        return null;
    }
}
