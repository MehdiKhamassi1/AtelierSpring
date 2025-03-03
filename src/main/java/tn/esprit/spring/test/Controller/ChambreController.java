package tn.esprit.spring.test.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.test.Entity.Chambre;
import tn.esprit.spring.test.ServiceInterface.IServiceChambre;

import java.util.List;

@AllArgsConstructor
@RestController
@Tag(name="Gestion chanmbres")
public class ChambreController {
    IServiceChambre serviceChamber;
    @Operation(description = "list all chambres")
    @GetMapping("/getChambres")
    public List<Chambre> retrieveAllChambres() {
        return serviceChamber.retrieveAllChambres();
    }
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody  Chambre c) {
        return serviceChamber.addChambre(c);
    }
    @PutMapping("/chambreUpdate")
    public Chambre updateChambre(@RequestBody  Chambre c) {
        return serviceChamber.updateChambre(c);
    }
    @GetMapping("/chambreID/{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return serviceChamber.retrieveChambre(idChambre);
    }

    public List<Chambre> getchambreadresseuniv(String nom) {
        return serviceChamber.getchambreadresseuniv(nom);
    }

    public Chambre findByReservationsEtudiantsCinAndBlocNomBlocLike(long Cin, String nomBloc) {
        return serviceChamber.findByReservationsEtudiantsCinAndBlocNomBlocLike(Cin, nomBloc);
    }
}
