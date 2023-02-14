package com.phamhieu.exercise.oop.ex1;

public class Power {
    public double powNumber(final double a, final int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }
}
