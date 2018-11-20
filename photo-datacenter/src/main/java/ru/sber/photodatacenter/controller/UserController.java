package ru.sber.photodatacenter.controller;

import org.springframework.web.bind.annotation.*;
import ru.sber.photodatacenter.model.User;
import ru.sber.photodatacenter.service.BaseService;

@RestController
@RequestMapping("/user")
public class UserController extends EntityControllerImpl<User> {

    public UserController(BaseService<User> baseService){
        super(baseService);
    }
}
