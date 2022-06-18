package pl.pjatk.jazs23210nbp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Gold gold;
    private Date startDate;
    private Date endDate;
//get current date and time


}
