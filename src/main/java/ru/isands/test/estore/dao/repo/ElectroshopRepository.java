package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isands.test.estore.dao.entity.Electroshop;
import ru.isands.test.estore.dao.entity.ElectroshopId;

public interface ElectroshopRepository extends JpaRepository<Electroshop, ElectroshopId> {
}