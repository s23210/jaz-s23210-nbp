package pl.pjatk.jazs23210nbp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.jazs23210nbp.domain.GoldRate;
import pl.pjatk.jazs23210nbp.services.GoldRateService;
import pl.pjatk.jazs23210nbp.services.NbpService;

@RestController
@RequestMapping("/nbp")
public class NbpController {
    private final NbpService nbpService;
    private final GoldRateService goldRateService;

    public NbpController(NbpService nbpService, GoldRateService goldRateService) {
        this.nbpService = nbpService;
        this.goldRateService = goldRateService;
    }

    @GetMapping("/getGoldRate")
    public ResponseEntity<GoldRate> getGoldRate(@PathVariable String startDate, @PathVariable String endDate) {
        return nbpService.getGoldRate(startDate, endDate);
    }

    @GetMapping("/getById")
    public ResponseEntity<GoldRate> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(goldRateService.getGoldById(id));
    }
}
