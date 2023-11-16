package com.example;// Student.java
// Student Class

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
  private int student_id;
  private String student_name;
  private double[] grades;
Scanner scanner=new Scanner(System.in);
  public int getStudent_id() {
    return student_id;
  }

  public void setStudent_id(int student_id) {
    this.student_id = student_id;
  }

  public String getStudent_name() {
    return student_name;
  }

  public void setStudent_name(String student_name) {
    this.student_name = student_name;
  }

  public double[] getGrades() {
    return grades;
  }

  public void addGrade() {
    if(grades==null)
    {
      grades=new double[5];
    }

    for(int i=0;i<grades.length;i++)
    {
      System.out.print("enter grade: ");
      grades[i]=scanner.nextDouble();
    }
  }
}
