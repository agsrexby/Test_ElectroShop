package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Electrotype;
import ru.isands.test.estore.dao.repo.ElectrotypeRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ElectrotypeServiceImpl implements ElectrotypeService {

    private final ElectrotypeRepository electrotypeRepository;

    @Override
    public List<Electrotype> findAll() {
        return electrotypeRepository.findAll();
    }

    @Override
    public Optional<Electrotype> findById(int id) {
        return electrotypeRepository.findById(id);
    }

    @Override
    public void save(Electrotype electrotype) {
        electrotypeRepository.save(electrotype);
    }

    @Override
    public void delete(Electrotype electrotype) {
        electrotypeRepository.delete(electrotype);
    }
}
