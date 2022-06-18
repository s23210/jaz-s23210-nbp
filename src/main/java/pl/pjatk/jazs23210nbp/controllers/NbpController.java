package pl.pjatk.jazs23210nbp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.jazs23210nbp.domain.GoldRate;
import pl.pjatk.jazs23210nbp.services.NbpService;

import java.util.Date;

@RestController
@RequestMapping("/nbp")
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/getGoldRate")
    public ResponseEntity<GoldRate> getGoldRate(@PathVariable Date startDate, @PathVariable Date endDate) {
        return nbpService.getGoldRate(startDate, endDate);
    }
}
