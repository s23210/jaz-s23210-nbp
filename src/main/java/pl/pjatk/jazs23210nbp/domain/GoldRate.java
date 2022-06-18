package pl.pjatk.jazs23210nbp.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class GoldRate {
//id (automatycznie przypisywane), ENUM oznaczające złoto, datę rozpoczynającą
//przedział, datę kończącą przedział, jaki został wyliczony kurs, data oraz godzina
//zapytania.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private Gold gold;
    private String startDate;
    private String endDate;


}
