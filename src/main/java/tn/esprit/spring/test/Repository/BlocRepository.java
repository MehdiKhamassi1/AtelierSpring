package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Bloc;
import tn.esprit.spring.test.Entity.Chambre;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
