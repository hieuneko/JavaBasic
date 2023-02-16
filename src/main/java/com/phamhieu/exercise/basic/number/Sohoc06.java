package com.phamhieu.exercise.basic.number;

public class Sohoc06 {

    static final double ACCURACY = 0.0001;

    public double findSquareRoot(final double input) {
        double number = input;
        double tempNumber = 1;
        while (number - tempNumber > ACCURACY) {
            number = (number + tempNumber) / 2;
            tempNumber = input / number;
        }
        return number;
    }
}
