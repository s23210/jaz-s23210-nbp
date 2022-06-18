package pl.pjatk.jazs23210nbp.domain;

import javax.persistence.*;

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
