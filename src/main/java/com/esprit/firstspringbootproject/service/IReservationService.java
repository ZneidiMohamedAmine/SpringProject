package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.Reservation;

public interface IReservationService {
    Reservation addReservation(Reservation res);

    Reservation removeReservation(Reservation res);
}
