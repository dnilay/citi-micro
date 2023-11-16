package org.example;

public class Person {

    private int age;
    private String name;

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

    public static void main(String[] args)
    {
        Person p1=new Person(20,"Shane");
        Person p2=new Person(19,"Shane");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        String str=new String("Hello World");
        String str1=new String("Hello World1");
        System.out.println(str.equals(str1));

    }
}
