package tn.esprit.spring.test.ServiceInterface;

import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Entity.Etudiant;

import java.util.List;

public interface IServiceEtudiant {
    List<Etudiant> retrieveAllEtudiants();
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(long idEtudiant);
    void removeEtudiant(long idEtudiant);
}
