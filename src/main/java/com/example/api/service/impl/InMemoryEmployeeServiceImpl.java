package com.example.api.service.impl;

import com.example.api.entity.Employee;
import com.example.api.repository.InMemoryEmployeeRepository;
import com.example.api.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("inMemory")
public class InMemoryEmployeeServiceImpl implements EmployeeService {

    private final InMemoryEmployeeRepository inMemoryEmployeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
     return inMemoryEmployeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return inMemoryEmployeeRepository.getAllEmployees();
    }

    @Override
    public Employee findById(Integer id) {
        return inMemoryEmployeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        inMemoryEmployeeRepository.updateEmployee(employee);
        return employee;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return deleteById(id);
    }
}
