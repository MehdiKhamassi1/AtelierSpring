package tn.esprit.spring.test.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.test.Entity.Bloc;
import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Repository.BlocRepository;
import tn.esprit.spring.test.ServiceInterface.IServiceBloc;
import tn.esprit.spring.test.ServiceInterface.IServiceChambre;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements IServiceBloc {
    BlocRepository blocRepository;
    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll() ;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }
    public List<Bloc> getByUnivNom(String Nom){
        return blocRepository.findByFoyerUniversiteNomUniversiteLike(Nom);
    }
}
