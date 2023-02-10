package com.phamhieu.exercise.basic.array;

public class Array05 {

    public int findSubOfTwoNumber(final int[] input) {
        return getMaxNumber(input) - getMinimumNumber(input);
    }

    private static int getMaxNumber(final int[] input) {
        int maxNumber = input[0];
        for (int i : input) {
            if (maxNumber < i) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    private static int getMinimumNumber(final int[] input) {
        int minNumber = input[0];
        for (int i : input) {
            if (minNumber > i) {
                minNumber = i;
            }
        }
        return minNumber;
    }
}
