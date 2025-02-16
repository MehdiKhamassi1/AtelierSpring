package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
