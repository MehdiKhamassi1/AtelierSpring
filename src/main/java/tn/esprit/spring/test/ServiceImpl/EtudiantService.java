package tn.esprit.spring.test.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.test.Entity.Etudiant;
import tn.esprit.spring.test.Repository.EtudiantRepository;
import tn.esprit.spring.test.ServiceInterface.IServiceEtudiant;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantService implements IServiceEtudiant {
    EtudiantRepository etudiantRepo;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepo.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepo.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepo.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        etudiantRepo.deleteById(idEtudiant);
    }
}
