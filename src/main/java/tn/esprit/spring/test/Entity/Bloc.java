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

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc ;
    private Long capaciteBloc ;
    @ManyToOne
    private  Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> Chambres;
}
