package ru.sber.photodatacenter.service;

import ru.sber.photodatacenter.model.Activity;

import java.util.List;

public interface ActivityService extends BaseService<Activity> {
    List<Activity> getAllByActivityGroupId(long activityGroupId);
}
