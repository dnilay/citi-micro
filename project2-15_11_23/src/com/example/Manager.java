package com.example;

import java.util.Date;

public class Manager extends Employee{

    private String departmentName;

    public Manager() {
     super();
    }

    public Manager(int employeeId, String name, double salary, Date birthDate, String departmentName) {
        super(employeeId, name, salary, birthDate);
        this.departmentName = departmentName;
    }

    public String getDetails()
    {
        return super.getEmployeeId()+" "+super.getName()+" "+super.getSalary()+" "+super.getBirthDate()+" "+departmentName;
    }

}
