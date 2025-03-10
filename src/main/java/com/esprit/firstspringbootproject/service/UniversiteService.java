package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    IUniversiteRepository universiteRepo;
    IFoyerRepository foyerRepo;

    @Override
    public Universite addUniversite(Universite uni) {
        return universiteRepo.save(uni);
    }

    @Override
    public Universite removeUniversite(Universite uni) {
        universiteRepo.delete(uni);
        return null;
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepo.findById(idFoyer).get();
        Universite universite = universiteRepo.findByNomUniversite(nomUniversite);

        if (foyer == null || universite == null) {
            throw new RuntimeException("Foyer ou Université introuvable !");
        }
        universite.setFoyer(foyer);
        foyer.setUniversite(universite);

        return universiteRepo.save(universite);
    }
}
