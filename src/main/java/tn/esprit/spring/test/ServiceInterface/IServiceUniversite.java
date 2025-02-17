package tn.esprit.spring.test.ServiceInterface;

import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Universite;

import java.util.List;

public interface IServiceUniversite {
    List<Universite> retrieveAllUniversities();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (long idUniversite);
    Universite findByFoyerCapaciteFoyerAndFoyerBlocsCapaciteBloc(long capbloc,long capfoyer);
}
