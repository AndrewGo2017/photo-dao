package ru.sber.photodatacenter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.photodatacenter.model.Activity;
import ru.sber.photodatacenter.repository.ActivityRepository;
import ru.sber.photodatacenter.service.ActivityService;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public Activity save(Activity entity) {
        return activityRepository.save(entity);
    }

    @Override
    public boolean delete(long id) {
        return activityRepository.delete(id) != 0;
    }

    @Override
    public Activity get(long id) {
        return activityRepository.findById(id).orElse(null);
    }

    @Override
    public List<Activity> getAll() {
        return activityRepository.findAll();
    }

    @Override
    public List<Activity> getAllByActivityGroupId(long activityGroupId) {
        return activityRepository.getAllByActivityGroup_Id(activityGroupId);
    }
}
