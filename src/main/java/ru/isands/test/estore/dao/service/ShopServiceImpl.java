package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Shop;
import ru.isands.test.estore.dao.repo.ShopRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    @Override
    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

    @Override
    public Optional<Shop> findById(int id) {
        return shopRepository.findById(id);
    }

    @Override
    public void save(Shop shop) {
        shopRepository.save(shop);
    }

    @Override
    public void delete(Shop shop) {
        shopRepository.delete(shop);
    }
}
