package org.example;

public class Doctor extends Person{

    private String specialistIn;
    private int yearsOfExp;

    public Doctor() {
    }

    public Doctor(int age, String name, String specialistIn, int yearsOfExp) {
        super(age, name);
        this.specialistIn = specialistIn;
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return super.toString()+ "Doctor{" +
                "specialistIn='" + specialistIn + '\'' +
                ", yearsOfExp=" + yearsOfExp +
                '}';
    }
}
