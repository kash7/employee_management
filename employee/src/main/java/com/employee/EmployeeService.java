package com.employee;



import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    Page<Employee> getAllEmployees(Pageable pageable);

    Optional<Employee> getEmployeeById(Long id);

    void addEmployee(Employee employee);

    void updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}