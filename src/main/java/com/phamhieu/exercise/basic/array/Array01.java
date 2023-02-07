package com.phamhieu.exercise.basic.array;

public class Array01 {

    public int findMaxNumberArray(final int[] input) {
        int maxNumber = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > maxNumber) {
                maxNumber = input[i];
            }
        }
        return maxNumber;
    }
}
