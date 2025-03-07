package ru.isands.test.estore.dao.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.isands.test.estore.dao.entity.Electroemployee;
import ru.isands.test.estore.dao.entity.ElectroemployeeId;

import java.util.List;
import java.util.Optional;

public interface ElectroemployeeService {
    Page<Electroemployee> findAll(Pageable pageable);
    List<Electroemployee> findAll();
    List<Electroemployee> findAllById(List<ElectroemployeeId> ids);
    Optional<Electroemployee> findById(ElectroemployeeId electroemployeeId);
    Electroemployee save(Electroemployee electroemployee);
    void delete(Electroemployee electroemployee);
}
