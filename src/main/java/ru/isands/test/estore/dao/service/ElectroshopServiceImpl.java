package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Electroshop;
import ru.isands.test.estore.dao.entity.ElectroshopId;
import ru.isands.test.estore.dao.repo.ElectroshopRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ElectroshopServiceImpl implements ElectroshopService {

    private final ElectroshopRepository electroshopRepository;

    @Override
    public List<Electroshop> findAll() {
        return electroshopRepository.findAll();
    }

    @Override
    public Optional<Electroshop> findById(ElectroshopId electroshopId) {
        return electroshopRepository.findById(electroshopId);
    }

    @Override
    public void save(Electroshop electroshop) {
        electroshopRepository.save(electroshop);
    }

    @Override
    public void delete(Electroshop electroshop) {
        electroshopRepository.delete(electroshop);
    }
}
