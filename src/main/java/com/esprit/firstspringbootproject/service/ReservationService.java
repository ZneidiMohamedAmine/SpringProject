package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entities.*;
import com.esprit.firstspringbootproject.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
