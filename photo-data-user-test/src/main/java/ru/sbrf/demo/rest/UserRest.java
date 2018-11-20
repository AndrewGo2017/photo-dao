package ru.sbrf.demo.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sbrf.demo.model.User;

import java.util.List;

@RequestMapping("/context/user")
public interface UserRest {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    User create(@RequestBody User someEntity);

    @PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    User update(@RequestBody User someEntity);

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    User get(@PathVariable("id") long id);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    boolean delete(@PathVariable("id") long id);

    @GetMapping(value = "/all" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<User> getAll();
}
