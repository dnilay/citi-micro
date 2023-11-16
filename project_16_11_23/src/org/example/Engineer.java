package org.example;

public class Engineer extends Person{

    private String stream;
    private int yearsOfExp;

    public Engineer() {
    }

    public Engineer(int age, String name, String stream, int yearsOfExp) {
        super(age, name);
        this.stream = stream;
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return super.toString()+ "Engineer{" +
                "stream='" + stream + '\'' +
                ", yearsOfExp=" + yearsOfExp +
                '}';
    }
}
