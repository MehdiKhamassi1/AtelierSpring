package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findByFoyerCapaciteFoyerAndFoyerBlocsCapaciteBloc(long capbloc,long capfoyer);
}
