package ru.isands.test.estore.dao.service;

import ru.isands.test.estore.dao.entity.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseService {
    List<Purchase> findAll();
    Optional<Purchase> findById(int id);
    void save(Purchase purchase);
    void delete(Purchase purchase);
}
