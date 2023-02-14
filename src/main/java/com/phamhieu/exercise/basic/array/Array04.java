package com.phamhieu.exercise.basic.array;

import java.util.Arrays;

public class Array04 {
    public int[] findLongestArray(final int[] input) {
        int length = 1;
        int maxLength = 1;
        int start = 0;
        int end = 0;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] - input[i] == 1) {
                length++;
                if (length > maxLength) {
                    maxLength = length;
                    start = i + 2 - length;
                    end = i + 2;
                }
            } else {
                length = 1;
            }
        }

        if (maxLength < 2) {
            return new int[]{input[0]};
        }

        return Arrays.copyOfRange(input, start, end);
    }
}
