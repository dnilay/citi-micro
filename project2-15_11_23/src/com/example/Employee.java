package com.example;

import java.util.Date;

public class Employee {
    private int employeeId;
     private String name;
     private double salary;
     private Date birthDate;

    public Employee() {
    }

    public Employee(int employeeId, String name, double salary, Date birthDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
