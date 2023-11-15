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

    @Override
    public String getDetails() {
        return super.getDetails()+" Department Name: "+departmentName;
    }

    public void A()
    {

    }
}
