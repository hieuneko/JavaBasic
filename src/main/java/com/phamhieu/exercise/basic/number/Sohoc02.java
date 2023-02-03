package com.phamhieu.exercise.basic.number;

public class Sohoc02 {

    public int findTotalOfNumber(final int input) {
        int number = input;
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        return total;
    }
}
