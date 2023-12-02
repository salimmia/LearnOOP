package com.salim.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    static { // Static Block will run only for the first time when the object is created
        System.out.println("I am Static Block");
        b = a * 5;
    }

    public static void main(String[] args){
        StaticBlock obj = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();

        System.out.println(obj2.a + " " + obj2.b);
    }
}
