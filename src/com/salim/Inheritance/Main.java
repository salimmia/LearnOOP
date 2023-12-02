package com.salim.Inheritance;

public class Main {
    public static void main(String[] args){
        Box box = new Box(2, 3, 4);

        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight box2 = new BoxWeight(2, 3, 4, 5);

        System.out.println(box2.l + " " + box2.w + " " + box2.h + " " + box2.weight);

        Box box3 = new BoxWeight(2, 3, 4, 5);

        System.out.println(box3.l + " " + box3.w + " " + box3.h);


//        BoxWeight box4 = new Box(2, 3, 4);


    }
}
