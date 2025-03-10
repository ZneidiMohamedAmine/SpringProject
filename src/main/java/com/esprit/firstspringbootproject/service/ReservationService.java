package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    IReservationRepository reservationRepo;

    @Override
    public Reservation addReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation removeReservation(Reservation res) {
        reservationRepo.delete(res);
        return null;
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversitaire, String nomUniversite) {
        return reservationRepo.findReservationsByAnneeUniversitaire(anneeUniversitaire);
    }
}
