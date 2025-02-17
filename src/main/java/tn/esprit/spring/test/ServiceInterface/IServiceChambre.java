package tn.esprit.spring.test.ServiceInterface;

import tn.esprit.spring.test.Entity.Chambre;

import java.util.List;

public interface IServiceChambre {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
    List<Chambre> getchambreadresseuniv(String nom);
    Chambre findByReservationsEtudiantsCinAndBlocNomBlocLike(long Cin,String nomBloc);
}
