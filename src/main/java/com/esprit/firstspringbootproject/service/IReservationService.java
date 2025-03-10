package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation res);

    Reservation removeReservation(Reservation res);

    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversitaire, String nomUniversite);
}
