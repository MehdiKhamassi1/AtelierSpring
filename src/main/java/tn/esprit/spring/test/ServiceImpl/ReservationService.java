package tn.esprit.spring.test.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.test.Entity.Reservation;
import tn.esprit.spring.test.Repository.ReservationRepository;
import tn.esprit.spring.test.ServiceInterface.IServiceReservation;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationService implements IServiceReservation {
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return null;
    }
}
