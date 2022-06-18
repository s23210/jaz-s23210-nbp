package pl.pjatk.jazs23210nbp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.jazs23210nbp.domain.GoldRate;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRateRepository extends JpaRepository<GoldRate, Integer> {
}
