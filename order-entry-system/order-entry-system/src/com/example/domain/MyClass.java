package com.example.domain;

public class MyClass {
    //instance variables
    private int a;
    private int b;

    //a=10
    //b=20
    public MyClass(int a,int b)
    {
        this.a=a;
    }

    public static void main(String args[]){
        MyClass m=new MyClass(10,20);
    }
}
