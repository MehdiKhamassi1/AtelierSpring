package tn.esprit.spring.test.ServiceInterface;

import tn.esprit.spring.test.Entity.Bloc;
import tn.esprit.spring.test.Entity.Chambre;

import java.util.List;

public interface IServiceBloc {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);

}
