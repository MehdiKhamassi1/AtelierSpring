package tn.esprit.spring.test.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id

    private String idReservation;
    private LocalDate anneeUniversitaire ;
    private Boolean estValide ;
    @ManyToMany
    private Set<Etudiant> Etudiants;

}
