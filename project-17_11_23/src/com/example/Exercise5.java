package com.example;

import java.util.*;

  public class Exercise5 {
  public static void main(String[] args) {
         // Create a empty hash set
     Set<String> h_set = new HashSet();
   // use add() method to add values in the hash set
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
          System.out.println("Size: "+h_set.size());
    System.out.println("Original Hash Set: " + h_set);
    System.out.println("Checking the above hash set  is empty or not! "+h_set.isEmpty());
    System.out.println("Remove all the elements from a Hash Set: ");
    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements "+h_set);   
   }
}