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
        return null;
    }

    @Override
    public Etudiant removeEtudiant(Long id) {
        Etudiant et = etudiantRepo.findById(id).orElse(null);

        if (et != null) {
            etudiantRepo.delete(et);
        } else {
            // Handle the case where the Etudiant was not found.
            // You could log a message, throw an exception, or return null.
            System.out.println("Etudiant with ID " + id + " not found.");
            return null; // Or throw an exception
        }

        return null;
    }

}
