package com.company;

public class Wooman extends Person{
    private String sitHome;

    public Wooman(String name, int age, String sitHome) {
        super(name, age);
        this.sitHome = sitHome;
    }

    @Override
    public String toString() {
        return
                super.toString()+" "+"Wooman{" +
                "sitHome='" + sitHome + '\'' +
                '}';
    }
}
