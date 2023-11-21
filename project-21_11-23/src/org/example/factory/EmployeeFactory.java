package org.example.factory;

import org.example.Employee;
import org.example.repo.EmployeeRepository;
import org.example.repo.EmployeeRepositoryImpl;

import javax.swing.*;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class EmployeeFactory {
    private String name;
    private double salary;
    private static Scanner scanner=new Scanner(System.in);
    private EmployeeRepository employeeRepository;

    {
        employeeRepository=new EmployeeRepositoryImpl();
    }
    public void createEmployee()
    {
        System.out.print("Enter Employee Name: ");
        name=scanner.next();
        System.out.print("Enter Employee Salary: ");
        salary=scanner.nextDouble();
        Employee employee=employeeRepository.createEmployee(new Employee(new Random().nextInt(10000),name,salary));
        System.out.println("Employee Created: "+employee);

    }

    public void listEmployees()
    {
        Collection<Employee> collection=employeeRepository.listAllEmployees();
        if(collection.isEmpty())
        {
            System.out.println("no employees to display");
        }
        else {
            for (Employee e:collection)
            {
                System.out.println(e);
            }
        }
    }

}
