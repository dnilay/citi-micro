package com.example;

public abstract class Vehicle {

    public abstract double calculateDistance(double startPoint,double endPoint);

    public abstract double fuelNeedsEfficiency(double distanceCovered, double fuelConsumed);

    public void sayHello()
    {
        System.out.println("hello from abstract vehicle class");
    }

    public abstract String getDetails();

}
