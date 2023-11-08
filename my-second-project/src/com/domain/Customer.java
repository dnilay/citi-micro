package com.domain;

public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;

    private String email;

    private CustomerType customerType;

    public void createCustomer(int id,String fName,String lName,String e,CustomerType cType)
    {
        customerId=id;
        firstName=fName;
        lastName=lName;
        email=e;
        customerType=cType;
    }

    public String getDetails()
    {
        return "Customer ID: "+customerId+" First Name: "+firstName+" Last Name: "+lastName+" email: "+email+" cuomer type: "+customerType;
    }
}
