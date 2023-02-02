package com.phamhieu.exercise;

public class sohoc01 {

    public static int findGCD(final int x, final int y) {
        int temp;
        int a, b;
        a = x;
        b = y;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int findLCM(final int x, final int y) {
        return (x * y) / findGCD(x, y);
    }
}
