package ru.sber.photodatacenter.controller;

import ru.sber.photodatacenter.model.BaseEntity;
import ru.sber.photodatacenter.service.BaseService;


import java.util.List;

public class EntityControllerImpl<T extends BaseEntity> implements EntityController<T> {
    private final BaseService<T> service;

    public EntityControllerImpl(BaseService<T> service){
        this.service = service;
    }

    @Override
    public T create(T someEntity) {
        return service.save(someEntity);
    }

    @Override
    public T update(T someEntity) {
        return service.save(someEntity);
    }

    @Override
    public T get(long id) {
        return service.get(id);
    }

    @Override
    public boolean delete(long id) {
        return service.delete(id);
    }

    @Override
    public List<T> getAll() {
        return service.getAll();
    }
}