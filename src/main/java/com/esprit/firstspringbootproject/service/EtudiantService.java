package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    IEtudiantRepository etudiantRepo;

    @Override
    public Etudiant addEtudiant(Etudiant et) {
        return etudiantRepo.save(et);
    }

    @Override
    public Etudiant removeEtudiant(Etudiant et) {
        etudiantRepo.delete(et);
        return null;
    }
}
