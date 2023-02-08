package com.phamhieu.exercise.basic.number;

public class Sohoc04 {

    public int findTotalOfArrayFibonaci(final int input) {
        if (input <= 0) {
            return 0;
        }

        if (input == 1) {
            return 1;
        }

        int total = 2;
        int f0;
        int f1 = 1;
        int fn = 1;
        while (fn < input) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
            total += fn;
        }
        return total;
    }
}
