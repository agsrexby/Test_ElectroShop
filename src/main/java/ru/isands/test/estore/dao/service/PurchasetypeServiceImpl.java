package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Purchasetype;
import ru.isands.test.estore.dao.repo.PurchasetypeRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PurchasetypeServiceImpl implements PurchasetypeService {

    private final PurchasetypeRepository purchasetypeRepository;

    @Override
    public List<Purchasetype> findAll() {
        return purchasetypeRepository.findAll();
    }

    @Override
    public Optional<Purchasetype> findById(int id) {
        return purchasetypeRepository.findById(id);
    }

    @Override
    public void save(Purchasetype purchasetype) {
        purchasetypeRepository.save(purchasetype);
    }

    @Override
    public void delete(Purchasetype purchasetype) {
        purchasetypeRepository.delete(purchasetype);
    }
}
