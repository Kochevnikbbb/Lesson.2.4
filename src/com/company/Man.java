package com.company;

public class Man extends Person{
    private String profession;

    public Man(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "Man{" +
                "profession='" + profession + '\'' +
                '}';
    }
}
