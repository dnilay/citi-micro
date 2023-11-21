package org.example;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class Main {
    public static void main(String[] args)
    {
        Set<Student> set = null;
        set=new TreeSet<Student>();

        Student s1=new Student(1,"John",4.5);
        Student s2=new Student(2,"Mary",4.6);
        Student s3=new Student(1,"John",3.5);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for(Student s:set)
        {
            System.out.println(s);
        }
        }
    }

