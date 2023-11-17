package com.example.repo;

import com.example.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private List<Employee> employees;

    {
        employees=new ArrayList<Employee>();
    }
    @Override
    public void createEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        Employee employee=null;
        for(Employee e:employees)
        {
            if(e.getEmployeeId()==employeeId)
            {

                employee=e;
                break;

            }
        }

        return employee;
    }
}
