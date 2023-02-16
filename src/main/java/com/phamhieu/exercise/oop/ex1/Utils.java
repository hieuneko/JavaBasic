package com.phamhieu.exercise.oop.ex1;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {

    public static double powNumber(final double a, final int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }

    public static int checkSidePoint(final Point a, final Point b, final Point x) {
        return (a.getY() - b.getY()) * (x.getX() - a.getX()) + (b.getX() - a.getX()) * (x.getY() - a.getY());
    }
}
