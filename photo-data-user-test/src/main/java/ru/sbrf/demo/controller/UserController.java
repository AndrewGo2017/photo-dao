package ru.sbrf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.demo.feign.UserFeign;
import ru.sbrf.demo.model.User;

import java.util.List;

@RestController
@RequestMapping("feign")
public class UserController implements EntityController<User> {
    @Autowired
    private UserFeign userFeign;

    @Override
    public User create(User someEntity) {
        return null;
    }

    @Override
    public User update(User someEntity) {
        return null;
    }

    @Override
    public User get(long id) {
        return userFeign.get(id);
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return userFeign.getAll();
    }
}