package tn.esprit.spring.test.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.test.Entity.Foyer;
import tn.esprit.spring.test.Repository.FoyerRepository;
import tn.esprit.spring.test.ServiceInterface.IServiceFoyer;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerService implements IServiceFoyer {
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
