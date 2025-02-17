package tn.esprit.spring.test.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.Repository.ChambreRepository;
import tn.esprit.spring.test.ServiceInterface.IServiceChambre;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreService implements IServiceChambre {
    ChambreRepository ChambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return ChambreRepository.findAll() ;
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return ChambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return ChambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return ChambreRepository.findById(idChambre).orElse(null);
    }

    public List<Chambre> getchambreadresseuniv(String nom){
        return ChambreRepository.findByBlocFoyerUniversiteAdresseLike(nom);
    }
    public Chambre findByReservationsEtudiantsCinAndBlocNomBlocLike(long Cin,String nomBloc){
        return ChambreRepository.findByReservationsEtudiantsCinAndBlocNomBlocLike(Cin,nomBloc);
    }
}
