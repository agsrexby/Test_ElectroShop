package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isands.test.estore.dao.entity.Electrotype;

public interface ElectrotypeRepository extends JpaRepository<Electrotype, Integer> {
}