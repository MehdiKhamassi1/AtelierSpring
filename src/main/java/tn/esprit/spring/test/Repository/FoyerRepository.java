package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Foyer;
import tn.esprit.spring.test.Entity.TypeC;

import java.lang.reflect.Type;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    Foyer findByBlocsNomBlocAndBlocsChambresTypeChambreLike(TypeC t,String nom);
}
