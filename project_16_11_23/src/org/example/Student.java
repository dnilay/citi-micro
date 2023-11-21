package org.example;

public class Student implements Comparable{

    private int studentId;
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student) o;
        if(gpa==student.gpa)
        {
            return 0;
        } else if (gpa>student.gpa) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
