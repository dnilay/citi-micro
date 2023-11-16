package org.example;

public class Person {

    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
       return "NAme Of The person is: "+name+" Age Of The person Is: "+age;
    }

    @Override
    public boolean equals(Object obj) {
        Person p=(Person) obj;
        if(age==p.age &&(name==p.name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
