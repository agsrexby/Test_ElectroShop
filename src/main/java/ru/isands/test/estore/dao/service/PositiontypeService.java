package ru.isands.test.estore.dao.service;

import ru.isands.test.estore.dao.entity.Positiontype;

import java.util.List;
import java.util.Optional;

public interface PositiontypeService {
    List<Positiontype> findAll();
    Optional<Positiontype> findById(int id);
    void save(Positiontype positiontype);
    void delete(Positiontype positiontype);
}
