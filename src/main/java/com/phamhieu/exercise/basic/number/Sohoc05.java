package com.phamhieu.exercise.basic.number;

public class Sohoc05 {

    public int findSum(final int input) {
        int total = 0;
        for (int i = 1; i <= input; i++) {
            total += i * (i + 1);
        }
        return total;
    }
}
