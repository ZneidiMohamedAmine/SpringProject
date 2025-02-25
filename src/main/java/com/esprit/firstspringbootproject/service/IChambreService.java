package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Chambre;

public interface IChambreService {
    Chambre addChambre(Chambre ch);

    Chambre removeChambre(Chambre ch);
}
