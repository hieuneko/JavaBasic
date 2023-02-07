package com.phamhieu.exercise.basic.array;

public class Array01 {

    public int findMaxNumberArray(final int[] input) {
        int maxNumber = input[0];
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i + 1]) {
                maxNumber = input[i + 1];
            }
        }
        return maxNumber;
    }
}
