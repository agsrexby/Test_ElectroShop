package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Electroitem;
import ru.isands.test.estore.dao.repo.ElectroitemRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ElectroItemServiceImpl implements ElectroItemService {

    private final ElectroitemRepository electroitemRepository;

    @Override
    public Page<Electroitem> findAll(Pageable pageable) {
        return electroitemRepository.findAll(pageable);
    }

    @Override
    public List<Electroitem> findAll() {
        return electroitemRepository.findAll();
    }

    @Override
    public Optional<Electroitem> findById(int id) {
        return electroitemRepository.findById(id);
    }

    @Override
    public List<Electroitem> findAllById(List<Integer> ids) {
        return electroitemRepository.findAllById(ids);
    }

    @Override
    public Electroitem save(Electroitem electroitem) {
        electroitemRepository.save(electroitem);
        return electroitem;
    }

    @Override
    public void delete(Electroitem electroitem) {
        electroitemRepository.delete(electroitem);
    }
}
