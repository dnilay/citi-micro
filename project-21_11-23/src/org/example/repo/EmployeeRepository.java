package org.example.repo;

import org.example.Employee;

import java.util.Collection;

public interface EmployeeRepository {

    public Employee createEmployee(Employee employee);
    public Collection<Employee> listAllEmployees();

    public Employee findEmployeeById(int employeeId);
}
