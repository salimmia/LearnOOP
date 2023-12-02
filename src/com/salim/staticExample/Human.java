package com.salim.staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static int population;

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;

        this.population++;
    }
}
