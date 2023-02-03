package com.phamhieu.exercise.basic.number;

public class Sohoc06 {

    public double findSquareRoot(final double n){
        double x = n;
        double y = 1;
        double e = 0.0001;
        while (x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return Math.round(x * 1000000.0) / 1000000.0;
    }
}
