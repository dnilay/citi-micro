package org.example.repo;

import org.example.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private Map<Integer,Employee> employeeMap;

    {
        employeeMap=new HashMap<Integer,Employee>();
    }
    @Override
    public Employee createEmployee(Employee employee) {
        employeeMap.put(new Random().nextInt(10000),employee);
        return employee;
    }

    @Override
    public Collection<Employee> listAllEmployees() {
        return employeeMap.values();
    }
}
