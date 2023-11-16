package com.example;

public class Company {

    private String companyName;
    private Vehicle vehicle;

    public Company(String companyName) {
        this.companyName=companyName;
    }

    public void addVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;
    }

   public String getDetails()
   {
       return "Company Name: "+companyName+" vehicle Details: "+vehicle.getDetails();
   }


}
