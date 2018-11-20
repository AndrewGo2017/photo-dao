package ru.sber.photodatacenter.service;

import ru.sber.photodatacenter.model.Statistic;
import ru.sber.photodatacenter.to.UserStatisticTimeTo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface StatisticService extends BaseService<Statistic> {
    LocalTime getTotalDayTime(long userId);

    List<UserStatisticTimeTo> getAllUserTotalDayTime(LocalDate from, LocalDate to);

    List<UserStatisticTimeTo> getAllUserTotalDayTimeWithActivityDetails(LocalDate from, LocalDate to);
}
