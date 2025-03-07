package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isands.test.estore.dao.entity.Electroitem;

public interface ElectroitemRepository extends JpaRepository<Electroitem, Integer> {
}