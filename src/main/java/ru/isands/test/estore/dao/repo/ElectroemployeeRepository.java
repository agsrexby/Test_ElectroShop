package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isands.test.estore.dao.entity.Electroemployee;
import ru.isands.test.estore.dao.entity.ElectroemployeeId;

public interface ElectroemployeeRepository extends JpaRepository<Electroemployee, ElectroemployeeId> {
}