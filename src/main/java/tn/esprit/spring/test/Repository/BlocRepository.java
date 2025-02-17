package tn.esprit.spring.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.test.Entity.Bloc;
import tn.esprit.spring.test.Entity.Chambre;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    List<Bloc> findByFoyerUniversiteNomUniversiteLike(String nom);
}
