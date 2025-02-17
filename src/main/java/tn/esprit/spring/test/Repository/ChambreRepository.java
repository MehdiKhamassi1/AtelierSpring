package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocFoyerUniversiteAdresseLike(String adresse);
    Chambre findByReservationsEtudiantsCinAndBlocNomBlocLike(long Cin,String nomBloc);
}
