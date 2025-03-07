package ru.isands.test.estore.dao.service;

import ru.isands.test.estore.dao.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(int id);
    void save(Employee employee);
    void delete(Employee employee);
}
