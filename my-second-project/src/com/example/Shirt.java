package com.example;

import com.domain.Color;
import com.domain.Size;

public class Shirt {

    private String shirtId;
    private Color shirtColor;

    private Size shirtSize;

     public void createShirt(String id, Color color, Size size)
    {
        shirtId=id;
        shirtColor=color;
        shirtSize=size;
    }

   public String getShirtDetails()
    {
        return "id: "+shirtId+" color: "+shirtColor+" size: "+shirtSize;
    }
}
