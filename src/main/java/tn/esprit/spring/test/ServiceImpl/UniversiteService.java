package tn.esprit.spring.test.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.test.Entity.Universite;
import tn.esprit.spring.test.Repository.UniversiteRepository;
import tn.esprit.spring.test.ServiceInterface.IServiceUniversite;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteService implements IServiceUniversite {
    UniversiteRepository universiterepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiterepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiterepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiterepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiterepository.findById(idUniversite).orElse(null);
    }
    public Universite findByFoyerCapaciteFoyerAndFoyerBlocsCapaciteBloc(long capbloc,long capfoyer){
        return universiterepository.findByFoyerCapaciteFoyerAndFoyerBlocsCapaciteBloc(capbloc,capfoyer);
    }
}
