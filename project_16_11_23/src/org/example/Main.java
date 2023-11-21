package org.example;

import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class Main {
    public static void main(String[] args)
    {
        Set<Employee> set = null;
        set=new TreeSet<Employee>();
      Employee employee1=new Employee(1,"John",20000);
        Employee employee2=new Employee(1,"John",1000);
        set.add(employee1);
        set.add(employee2);
        System.out.println(set);

        }
    }

