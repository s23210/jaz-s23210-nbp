package pl.pjatk.jazs23210nbp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.jazs23210nbp.domain.GoldRate;

@Repository
public interface GoldRateRepository extends JpaRepository<GoldRate, Integer> {
    GoldRate getById(Integer id);
}
