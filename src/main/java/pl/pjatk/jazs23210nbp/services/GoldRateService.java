package pl.pjatk.jazs23210nbp.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.pjatk.jazs23210nbp.domain.GoldRate;
import pl.pjatk.jazs23210nbp.repositories.GoldRateRepository;

@Service
public class GoldRateService {
    public GoldRateService(GoldRateRepository goldRateRepository) {
        this.goldRateRepository = goldRateRepository;
    }
    private final GoldRateRepository goldRateRepository;

    public GoldRate getGoldById(Integer id) {
        return goldRateRepository.getById(id);
    }
}
