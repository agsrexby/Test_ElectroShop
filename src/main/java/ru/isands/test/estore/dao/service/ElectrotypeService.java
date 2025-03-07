package ru.isands.test.estore.dao.service;

import ru.isands.test.estore.dao.entity.Electrotype;

import java.util.List;
import java.util.Optional;

public interface ElectrotypeService {
    List<Electrotype> findAll();
    Optional<Electrotype> findById(int id);
    void save(Electrotype electrotype);
    void delete(Electrotype electrotype);
}
