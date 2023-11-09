package com.example.domain;

import javax.swing.plaf.IconUIResource;
import java.util.Date;
import java.util.Random;

public class Order {
    //attributes
    //instance variables
    private int orderId;
    private Date orderDate;
    private String orderName;
    private boolean isDelivered;

    //class variable
    private static int count=0;

    public Order()
    {
        count++;
        System.out.println(count);
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

}
