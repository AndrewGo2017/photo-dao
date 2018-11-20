package ru.sber.photodatacenter.controller;

import org.springframework.web.bind.annotation.*;
import ru.sber.photodatacenter.model.ActivityGroup;
import ru.sber.photodatacenter.service.BaseService;

@RestController
@RequestMapping("/activityGroup")
public class ActivityGroupController extends EntityControllerImpl<ActivityGroup> {

    public ActivityGroupController(BaseService<ActivityGroup> service) {
        super(service);
    }
}
