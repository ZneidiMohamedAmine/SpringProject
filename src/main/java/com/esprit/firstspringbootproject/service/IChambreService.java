package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Chambre;
import com.esprit.firstspringbootproject.entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre ch);

    Chambre removeChambre(Chambre ch);

    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre typeChambre);

    List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeChambre);
}
