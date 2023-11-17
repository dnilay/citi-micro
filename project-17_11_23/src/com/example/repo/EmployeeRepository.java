package com.example.repo;

import com.example.Employee;

import java.util.List;

public interface EmployeeRepository {

    public void createEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(int employeeId);
}
