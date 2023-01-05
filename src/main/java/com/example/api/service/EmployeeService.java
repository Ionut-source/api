package com.example.api.service;

import com.example.api.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    // Save an employee
    Employee addEmployee(Employee employee);

    // Get employees
    List<Employee> getAllEmployees();

    // Get one employee
    Employee findById(Integer id);

    // Update employee
    Employee updateEmployee(Employee employee);

    // Delete employee
    Boolean deleteById(Integer id);
}
