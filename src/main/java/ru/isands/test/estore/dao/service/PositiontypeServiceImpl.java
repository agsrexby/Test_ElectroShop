package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Positiontype;
import ru.isands.test.estore.dao.repo.PositiontypeRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PositiontypeServiceImpl implements PositiontypeService {

    private final PositiontypeRepository positiontypeRepository;

    @Override
    public List<Positiontype> findAll() {
        return positiontypeRepository.findAll();
    }

    @Override
    public Optional<Positiontype> findById(int id) {
        return positiontypeRepository.findById(id);
    }

    @Override
    public void save(Positiontype positiontype) {
        positiontypeRepository.save(positiontype);
    }

    @Override
    public void delete(Positiontype positiontype) {
        positiontypeRepository.delete(positiontype);
    }
}
