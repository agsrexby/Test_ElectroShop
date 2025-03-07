package ru.isands.test.estore.dao.service;

import ru.isands.test.estore.dao.entity.Electroshop;
import ru.isands.test.estore.dao.entity.ElectroshopId;

import java.util.List;
import java.util.Optional;

public interface ElectroshopService {
    List<Electroshop> findAll();
    Optional<Electroshop> findById(ElectroshopId electroshopId);
    void save(Electroshop electroshop);
    void delete(Electroshop electroshop);
}
