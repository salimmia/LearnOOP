package com.salim.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double l) {
        this.l = l;
        this.w = l;
        this.h = l;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}
