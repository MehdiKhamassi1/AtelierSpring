package tn.esprit.spring.test.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.test.Entity.Universite;
import tn.esprit.spring.test.ServiceInterface.IServiceUniversite;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteController {
    IServiceUniversite serviceUniversite;
    @GetMapping("/getUniversites")
    public List<Universite> retrieveAllUniversities() {
        return serviceUniversite.retrieveAllUniversities();
    }
    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite u) {
        return serviceUniversite.addUniversite(u);
    }
    @PutMapping("/UniversiteUpdate")
    public Universite updateUniversite(@RequestBody Universite u) {
        return serviceUniversite.updateUniversite(u);
    }
    @GetMapping("/universiteID/{idBloc}")
    public Universite retrieveUniversite(long idUniversite) {
        return serviceUniversite.retrieveUniversite(idUniversite);
    }

    public Universite findByFoyerCapaciteFoyerAndFoyerBlocsCapaciteBloc(long capbloc, long capfoyer) {
        return serviceUniversite.findByFoyerCapaciteFoyerAndFoyerBlocsCapaciteBloc(capbloc, capfoyer);
    }
}
