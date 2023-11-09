package com.example.domain;

import java.util.Scanner;

public class Shirt {
    private int shirtId;
    private String color;
    private double price;
    private String size;

    private Scanner scanner=new Scanner(System.in);

    public void createShirt()
    {

    }


    public String getShirtDetails()
    {
        return "shirt id: "+shirtId+" shirt color: "+color+" Price: "+price+" Size: "+size;
    }

}
