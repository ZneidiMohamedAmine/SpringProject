package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Universite;

public interface IUniversiteService {
    Universite addUniversite(Universite uni);

    Universite removeUniversite(Universite uni);
}
