package com.example.domain;

import javax.swing.plaf.IconUIResource;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Order {
    //attributes
    //instance variables
    private int orderId;
    private Date orderDate;
    private String orderName;
    private boolean isDelivered;
    private Shirt shirt;

    //class variable
    private static int count=0;
    private Scanner scanner=new Scanner(System.in);

    public Order()
    {
        shirt=new Shirt();
    }

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public Order(int orderId, Date orderDate, String orderName) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderName = orderName;
    }

    public Order(int orderId, Date orderDate, String orderName, boolean isDelivered) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderName = orderName;
        this.isDelivered = isDelivered;
    }

    public String displayDetails()
    {
        return "Order ID: "+orderId+" Order Date: "+orderDate+" Order Name: "+orderName+" Deliveed:? "+isDelivered;
    }

    public void createOrder()
    {
        System.out.print("Enter Order Name: ");
        orderName=scanner.next();
        System.out.print("Enter Order ID: ");
        orderId=scanner.nextInt();
        orderDate=new Date();
        isDelivered=false;
        shirt.createShirt();
    }

}
