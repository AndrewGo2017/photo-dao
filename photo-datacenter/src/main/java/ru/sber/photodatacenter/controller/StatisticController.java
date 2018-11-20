package ru.sber.photodatacenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import ru.sber.photodatacenter.model.Statistic;
import ru.sber.photodatacenter.service.BaseService;
import ru.sber.photodatacenter.service.StatisticService;
import ru.sber.photodatacenter.to.UserStatisticTimeTo;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/statistic")
public class StatisticController extends EntityControllerImpl<Statistic> {

    @Autowired
    private StatisticService statisticService;

    public StatisticController(BaseService<Statistic> service) {
        super(service);
    }

    @GetMapping("/total-day-details/{from}/{to}")
    public List<UserStatisticTimeTo> getAllUserTotalDayTimeWithActivityDetails(
                                                          @PathVariable("from") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate from,
                                                          @PathVariable("to") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate to){
        return statisticService.getAllUserTotalDayTimeWithActivityDetails(from, to);
    }

    @GetMapping("/total-day/{from}/{to}")
    public List<UserStatisticTimeTo> getAllUserTotalDayTime(
            @PathVariable("from") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate from,
            @PathVariable("to") @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate to){
        return statisticService.getAllUserTotalDayTime(from, to);
    }
}