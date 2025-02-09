package tn.esprit.spring.test.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre ;

    @Enumerated(EnumType.STRING)
    private  TypeC typeChambre ;
    @ManyToOne
    private Bloc bloc ;
    @OneToMany
    private Set<Reservation> Reservations;


}
