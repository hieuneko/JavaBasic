package com.phamhieu.exercise.basic.number;

public class Sohoc02 {

    public int findTotalOfNumber(final int n) {
        int input = n;
        int total = 0;
        while (input != 0) {
            total += input % 10;
            input /= 10;
        }
        return total;
    }
}
