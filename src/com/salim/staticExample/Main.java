package com.salim.staticExample;

public class Main {
    public static void main(String[] args){
        Human salim = new Human("Salim", 24, 10000, false);
        System.out.println(salim.population);
        Human halim = new Human("Halim", 23, 15000, true);
        System.out.println(halim.population);
        Human tomal = new Human("Tomal", 21, 20000, false);
        System.out.println(tomal.population);
        System.out.println(Human.population);
    }
}
