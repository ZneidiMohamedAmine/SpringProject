package com.esprit.firstspringbootproject.controller;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.entities.Reservation;
import com.esprit.firstspringbootproject.service.IBlocService;
import com.esprit.firstspringbootproject.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation res) {
        return reservationService.addReservation(res);
    }

    @DeleteMapping("/delete-reservation")
    public Reservation deleteReservation(@RequestBody Reservation res) {
        reservationService.removeReservation(res);
        return null;
    }

    @GetMapping("/reservations/{anneeUniversitaire}/{nomUniversite}")
    public List<Reservation> getReservationsParAnneeUniversitaire(@PathVariable Date anneeUniversitaire, @PathVariable String nomUniversite) {
        return reservationService.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversitaire, nomUniversite);
    }
}
