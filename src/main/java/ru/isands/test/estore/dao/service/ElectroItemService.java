package ru.isands.test.estore.dao.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.isands.test.estore.dao.entity.Electroitem;

import java.util.List;
import java.util.Optional;

public interface ElectroItemService {
    Page<Electroitem> findAll(Pageable pageable);
    List<Electroitem> findAll();
    Optional<Electroitem> findById(int id);
    List<Electroitem> findAllById(List<Integer> ids);
    Electroitem save(Electroitem electroitem);
    void delete(Electroitem electroitem);
}
