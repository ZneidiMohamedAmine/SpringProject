package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type) {
        return chambreRepo.findChambresNonReservees(nomUniversite, type);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepo.findByBlocIdBlocAndTypeC(idBloc, typeC);
    }
}