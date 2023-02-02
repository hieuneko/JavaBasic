package com.phamhieu.exercise;

public class sohoc01 {
    public static int findGCD(int x, int y) {
        int temp;
        while (y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    public static int findLCM(int x, int y) {
        return (x * y) / findGCD(x, y);
    }
}
