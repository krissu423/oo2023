package com.example.kontrolltoo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class PoodController {
    Pood pood;

    public PoodController() {
        pood = new Pood("Supermarket", LocalTime.of(9, 0), LocalTime.of(18, 0), 10);
    }

    @GetMapping("/pood")
    public Pood saaPood(){
        return pood;
    }

    /*@GetMapping("lisa-pood/{nimetus}/{LocalTime}/{LocalTime}/{kylastajateArv}")
    public lisaPood(
            @PathVariable String nimetus,
            @PathVariable LocalTime avamisaeg,
            @PathVariable LocalTime sulgemisaeg,
            @PathVariable int kylastajateArv) {
        pood.add(new Pood(nimetus, avamisaeg, sulgemisaeg, kylastajateArv));
        return pood;
    }*/

    @GetMapping("/poed/{kellaaeg}")
    public String kasPoodOnLahti(@PathVariable String kellaaeg) {
        LocalTime uuritavAeg = LocalTime.parse(kellaaeg);
        LocalTime avamisaeg = LocalTime.of(9, 0); // Võib asendada oma poodide avamis- ja sulgemisajaga
        LocalTime sulgemisaeg = LocalTime.of(18, 0); // Võib asendada oma poodide avamis- ja sulgemisajaga

        if (uuritavAeg.isAfter(avamisaeg) && uuritavAeg.isBefore(sulgemisaeg)) {
            return "Pood on lahti";
        } else {
            return "Pood on kinni";
        }
    }

    @GetMapping("/suurenda-kylastajaid")
    public Pood suurendaKylastajaid() {
        pood.setKylastajateArv( pood.getKylastajateArv()+1 );
        return pood;
    }
}






