package tn.esprit.spring.test.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.test.Entity.Bloc;
import tn.esprit.spring.test.ServiceInterface.IServiceBloc;

import java.util.List;

@AllArgsConstructor
@RestController
public class BlocController {
    IServiceBloc serviceBloc;
    @GetMapping("/getBlocs")
    public List<Bloc> retrieveBlocs() {
        return serviceBloc.retrieveBlocs();
    }
    @PutMapping("/blocUpdate")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return serviceBloc.updateBloc(bloc);
    }
    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return serviceBloc.addBloc(bloc);
    }
    @GetMapping("/blocID/{idBloc}")
    public Bloc retrieveBloc(@PathVariable long idBloc) {
        return serviceBloc.retrieveBloc(idBloc);
    }
    @DeleteMapping("/delete/{idBloc}")
    public void removeBloc(@PathVariable long idBloc) {
        serviceBloc.removeBloc(idBloc);
    }

    public List<Bloc> getByUnivNom(String Nom) {
        return serviceBloc.getByUnivNom(Nom);
    }
}
