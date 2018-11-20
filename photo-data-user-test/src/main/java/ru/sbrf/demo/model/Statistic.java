package ru.sbrf.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.LocalTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Statistic extends BaseEntity {


    private User user;


    private Activity activity;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime time;

    public Statistic(Long id, User user, Activity activity, LocalDate date, LocalTime time) {
        super(id);
        this.user = user;
        this.activity = activity;
        this.date = date;
        this.time = time;
    }
}
