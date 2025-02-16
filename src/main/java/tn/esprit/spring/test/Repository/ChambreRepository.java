package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
