package ru.sbrf.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sbrf.demo.model.BaseEntity;

import java.util.List;

public interface EntityController<T extends BaseEntity> {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T create(@RequestBody T someEntity);

    @PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T update(@RequestBody T someEntity);

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    T get(@PathVariable("id") long id);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    boolean delete(@PathVariable("id") long id);

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<T> getAll();
}
