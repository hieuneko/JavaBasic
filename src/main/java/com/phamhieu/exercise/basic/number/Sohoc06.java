package com.phamhieu.exercise.basic.number;

public class Sohoc06 {

    static final double ACCURACY = 0.0001;

    public double findSquareRoot(final double input) {
        double number = input;
        double temp = 1;
        while (number - temp > ACCURACY) {
            number = (number + temp) / 2;
            temp = input / number;
        }
        return number;
    }
}
