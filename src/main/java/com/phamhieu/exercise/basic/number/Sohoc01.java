package com.phamhieu.exercise.basic.number;

public class Sohoc01 {

    public int findGCD(final int x, final int y) {
        int a = x;
        int b = y;
        while (b != 0) {
            int temp;
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int findLCM(final int x, final int y) {
        return (x * y) / findGCD(x, y);
    }
}
