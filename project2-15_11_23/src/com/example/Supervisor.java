package com.example;

import java.util.Date;

public class Supervisor extends Employee {

    private String superviseTo;

    public Supervisor() {
       super();
    }

    public Supervisor(int employeeId, String name, double salary, Date birthDate, String superviseTo) {
        super(employeeId, name, salary, birthDate);
        this.superviseTo = superviseTo;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" Supervise To: "+superviseTo;
    }
}
