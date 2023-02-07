package com.phamhieu.exercise.basic.array;

public class Array02 {

    public int findTotalInArray(final int[] input) {
        int totalEven = getTotalEven(input);
        int totalOdd = getTotalOdd(input);
        return totalEven - totalOdd;
    }

    public int getTotalEven(final int[] input) {
        int totalEven = 0;
        for (int j : input) {
            if (j % 2 == 0) {
                totalEven += j;
            }
        }
        return totalEven;
    }

    public int getTotalOdd(final int[] input) {
        int totalOdd = 0;
        for (int j : input)
            if (j % 2 != 0) {
                totalOdd += j;
            }
        return totalOdd;
    }
}
