package tn.esprit.spring.test.ServiceInterface;

import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Foyer;
import tn.esprit.spring.test.Entity.TypeC;

import java.util.List;

public interface IServiceFoyer {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);
    void removeFoyer (long idFoyer);
    Foyer findgettypenombloc(TypeC t ,String nom);
}
