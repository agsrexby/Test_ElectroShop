package ru.isands.test.estore.dao.service;

import ru.isands.test.estore.dao.entity.Purchasetype;

import java.util.List;
import java.util.Optional;

public interface PurchasetypeService {
    List<Purchasetype> findAll();
    Optional<Purchasetype> findById(int id);
    void save(Purchasetype purchasetype);
    void delete(Purchasetype purchasetype);
}
