package pl.pjatk.jazs23210nbp.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs23210nbp.domain.GoldRate;

import java.util.Date;

@Service
public class NbpService {
    private static final String RESOURCE_URL = "http://api.nbp.pl/api";
    private final RestTemplate restTemplate;

    public NbpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<GoldRate> getGoldRate(String startDate, String endDate) {
        return restTemplate.getForEntity(RESOURCE_URL + "/cenyzlota/" + startDate +"/" + endDate + "/", GoldRate.class);
    }
}
