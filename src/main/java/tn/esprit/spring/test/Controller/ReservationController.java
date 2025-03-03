package tn.esprit.spring.test.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.test.Entity.Reservation;
import tn.esprit.spring.test.ServiceInterface.IServiceReservation;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    IServiceReservation serviceReservation;
    @GetMapping("/getReservations")
    public List<Reservation> retrieveAllReservation() {
        return serviceReservation.retrieveAllReservation();
    }
    @PutMapping("/ReservationUpdate")
    public Reservation updateReservation(@RequestBody Reservation res) {
        return serviceReservation.updateReservation(res);
    }
    @GetMapping("/reservationID/{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation) {
        return serviceReservation.retrieveReservation(idReservation);
    }
}
