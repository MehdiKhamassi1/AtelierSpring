package tn.esprit.spring.test.ServiceInterface;

import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Reservation;

import java.util.List;

public interface IServiceReservation {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);
}
