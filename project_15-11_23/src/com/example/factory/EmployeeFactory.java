package com.example.factory;

import com.example.Employee;

import java.util.Random;
import java.util.Scanner;

public class EmployeeFactory {

    private static Employee[] employees;

    private static Scanner scanner=new Scanner(System.in);
    //default initializer

    //blank initializer
    static
    {
        employees=new Employee[3];
    }

    public static Employee[]  initializeEmployees()
    {
        for(int i=0;i<employees.length;i++)
        {
            System.out.println("Initializing Employee["+(i+1)+"]");
            employees[i]=createEmployee();
        }
        return employees;
    }

    private static Employee createEmployee()
    {
        String fName=null;
        String lName=null;
        String email=null;

        System.out.print("Enter First Name: ");
        fName=scanner.next();
        System.out.print("Enter Last Name: ");
        lName=scanner.next();
        System.out.print("Enter Email: ");
        email=scanner.next();
        return new Employee(new Random().nextInt(10000),fName,lName,email);

    }

    public static Employee findEmployeeById(int employeeId)
    {
        Employee e=null;

        for(Employee employee:employees)
        {
            if(employee.getEmployeeId()==employeeId)
            {
                e=employee;
                break;
            }
        }
        return e;
    }
}
