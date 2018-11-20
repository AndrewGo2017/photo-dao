package ru.sber.photodatacenter.controller;

import org.springframework.web.bind.annotation.*;
import ru.sber.photodatacenter.model.Activity;
import ru.sber.photodatacenter.service.BaseService;

@RestController
@RequestMapping("/activity")
public class ActivityController  extends EntityControllerImpl<Activity> {

    public ActivityController(BaseService<Activity> baseService){
        super(baseService);
    }
}
