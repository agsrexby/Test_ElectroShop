package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isands.test.estore.dao.entity.Purchasetype;

public interface PurchasetypeRepository extends JpaRepository<Purchasetype, Integer> {
}