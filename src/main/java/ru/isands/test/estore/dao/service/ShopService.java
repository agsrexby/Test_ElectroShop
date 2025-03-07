package ru.isands.test.estore.dao.service;

import ru.isands.test.estore.dao.entity.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopService {
    List<Shop> findAll();
    Optional<Shop> findById(int id);
    void save(Shop shop);
    void delete(Shop shop);
}
