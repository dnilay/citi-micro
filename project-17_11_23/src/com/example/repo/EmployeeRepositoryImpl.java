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

    @Override
    public void deleteById(int employeeId) {
        Employee e=getEmployeeById(employeeId);
        if(e==null)
        {
            System.out.println("nu such employee found with id: "+employeeId);
        }
        else
        {
            employees.remove(e);
            System.out.println("removed...");
        }
    }
}
