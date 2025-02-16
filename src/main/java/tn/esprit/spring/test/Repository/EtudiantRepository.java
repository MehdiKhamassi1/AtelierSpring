package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
