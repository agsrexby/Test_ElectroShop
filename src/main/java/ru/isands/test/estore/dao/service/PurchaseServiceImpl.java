package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Purchase;
import ru.isands.test.estore.dao.repo.PurchaseRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    @Override
    public List<Purchase> findAll() {
        return purchaseRepository.findAll();
    }

    @Override
    public Optional<Purchase> findById(int id) {
        return purchaseRepository.findById(id);
    }

    @Override
    public void save(Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    @Override
    public void delete(Purchase purchase) {
        purchaseRepository.delete(purchase);
    }
}
