package com.example;

public class AirCargo extends Vehicle{

    private String makeName;
    private String registrationNumber;
    private double maxLoad;
    @Override
    public double calculateDistance(double startPoint, double endPoint) {
        return 0;
    }

    @Override
    public double fuelNeedsEfficiency(double distanceCovered, double fuelConsumed) {
        return 0;
    }

    @Override
    public String getDetails() {
        return null;
    }
}
