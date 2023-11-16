package com.example;// Main.java
// Main Class
import java.util.ArrayList;
import java.util.List;
public class Main {
  public static void main(String[] args) {
    // Create an instance of Student
    Student student = new Student();

    // Set the values using the setter methods
    student.setStudent_id(1);
    student.setStudent_name("Nadia Hyakinthos");

    // Add grades using the addGrade() method
    student.addGrade();


    // Get the values using the getter methods
    int student_id = student.getStudent_id();
    String student_name = student.getStudent_name();
    double[] grades = student.getGrades();

    // Print the values
    System.out.println("Student ID: " + student_id);
    System.out.println("Student Name: " + student_name);
    System.out.println("Grades:\n" );
    for(double d:grades)
    {
      System.out.print("\t"+d);
    }
  }
}
