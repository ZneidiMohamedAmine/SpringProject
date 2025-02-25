package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Etudiant;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant et);

    Etudiant removeEtudiant(Etudiant et);
}
