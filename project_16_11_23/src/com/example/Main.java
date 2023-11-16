package com.example;// Main.java

import java.util.UUID;

public class Main {
  public static void main(String[] args) {


    Company company=new Company("ABC Motorcorp");
    Vehicle vehicle1=new Truck(100,"Tata", UUID.randomUUID().toString());
    Vehicle vehicle2=new RiverBerge(1089,"ABC",UUID.randomUUID().toString());
    company.addVehicle(vehicle1);
    double distanceCovered=vehicle1.calculateDistance(120.89,890.87);
    System.out.println(company.getDetails()+" Distance Covered: "+distanceCovered+" Fuel efficiency"+
            vehicle1.fuelNeedsEfficiency(distanceCovered,300));
    company.addVehicle(vehicle2);
    distanceCovered=vehicle2.calculateDistance(678,90876);
    System.out.println(company.getDetails()+" Distance Covered: "+distanceCovered+" Fuel efficiency"+
            vehicle2.fuelNeedsEfficiency(distanceCovered,30000));
  }
}
