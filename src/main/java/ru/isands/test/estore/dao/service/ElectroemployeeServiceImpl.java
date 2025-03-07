package ru.isands.test.estore.dao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.isands.test.estore.dao.entity.Electroemployee;
import ru.isands.test.estore.dao.entity.ElectroemployeeId;
import ru.isands.test.estore.dao.repo.ElectroemployeeRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ElectroemployeeServiceImpl implements ElectroemployeeService {

    private final ElectroemployeeRepository electroemployeeRepository;

    @Override
    public Page<Electroemployee> findAll(Pageable pageable) {
        return electroemployeeRepository.findAll(pageable);
    }

    @Override
    public List<Electroemployee> findAll() {
        return electroemployeeRepository.findAll();
    }
    @Override
    public List<Electroemployee> findAllById(List<ElectroemployeeId> ids) {
        return electroemployeeRepository.findAllById(ids);
    }

    @Override
    public Optional<Electroemployee> findById(ElectroemployeeId electroemployeeId) {
        return electroemployeeRepository.findById(electroemployeeId);
    }

    @Override
    public Electroemployee save(Electroemployee electroemployee) {
        electroemployeeRepository.save(electroemployee);
        return electroemployee;
    }

    @Override
    public void delete(Electroemployee electroemployee) {
        electroemployeeRepository.delete(electroemployee);
    }
}
