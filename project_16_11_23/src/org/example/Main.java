package org.example;

import java.util.UUID;

public class Main {
    public static void main(String[] args)
    {
        Person[] persons=new Person[5];
        //hetrogenious collection
        persons[0]=new Doctor(25,"Joh Doe","Heart",3);
        persons[1]=new Engineer(25,"Shane Warne","IT",4);
        persons[2]=new Person(25,"Mary Public");
        persons[3]=new Doctor(67,"Rahul","surgery",19);
        persons[4]=new Engineer(56,"Sachin","Mechanical",17);

        for(Person p: persons)
        {
            if(p instanceof Doctor)
            {
                Doctor d=(Doctor)p;
                System.out.println("Hey I Am A Doctor \n"+d);
            } else if (p instanceof Engineer) {
                Engineer e=(Engineer) p;
                System.out.println("Hey I Am An Engineer \n"+e);

            }
            else
            {
                System.out.println("I Am A Common Person \n"+p);
            }
        }
    }
}
