package com.example;

public class Truck extends Vehicle{

    private double maxLoad;
    private String makeName;
    private String registrationNumber;
    public Truck() {
    }

    public Truck(double maxLoad, String makeName, String registrationNumber) {
        this.maxLoad = maxLoad;
        this.makeName = makeName;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public double calculateDistance(double startPoint,double endPoint) {
        return endPoint-startPoint;
    }

    @Override
    public double fuelNeedsEfficiency(double distanceCovered, double fuelConsumed) {
        return distanceCovered/fuelConsumed;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Hello from truck class");
    }

    @Override
    public String getDetails() {
        return "make name: "+makeName+" registration number: "+registrationNumber+" max load"+maxLoad;
    }
}
