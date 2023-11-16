package com.example;

public class RiverBerge extends Vehicle{

    private double maxLoad;
    private String makeName;
    private String registrationNumber;
    public RiverBerge() {
    }

    public RiverBerge(double maxLoad, String makeName, String registrationNumber) {
        this.maxLoad = maxLoad;
        this.makeName = makeName;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public double calculateDistance(double startPoint, double endPoint) {
        return endPoint-startPoint;
    }

    @Override
    public double fuelNeedsEfficiency(double distanceCovered, double fuelConsumed) {
        return distanceCovered/fuelConsumed;
    }

    @Override
    public void sayHello() {
        super.sayHello();

        System.out.println("hello from RiverBerge Class");
    }

    @Override
    public String getDetails() {
        return "Make Name: "+makeName+" registration number: "+registrationNumber+" max capacity: "+maxLoad;
    }
}
