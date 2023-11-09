package com.example.domain;

import java.util.Scanner;

public class Customer {

    private int customerId;
    private String customerName;
    private Order order;
    private Scanner scanner=new Scanner(System.in);
    public Customer() {
        order=new Order();
    }

    public void creteCustomer()
    {
        System.out.print("enter customer id: ");
        customerId=scanner.nextInt();
        System.out.print("enter customer name: ");
        customerName=scanner.next();
        order.createOrder();

    }


    public void displayCustomerDetails()
    {
        System.out.println("Customer ID: "+customerId+" Customer Name: "+customerName+"\nOrderDetails: "+order.displayDetails());
    }

}
