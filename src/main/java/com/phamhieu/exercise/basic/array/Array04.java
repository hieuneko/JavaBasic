package com.phamhieu.exercise.basic.array;

import java.util.Arrays;

public class Array04 {
    public int[] findLongestArray(final int[] input) {
        int maxLength = 0;
        int end = 0;
        int start = 0;
        for (int i = 1; i < input.length; i++) {
            int count = 1;
            for (int j = i; j > 0; j--) {
                if (input[j] - input[j - 1] == 1) {
                    count++;
                    if (count > maxLength) {
                        maxLength = count;
                        end = i;
                        start = j - 1;
                    }
                }

            }
        }
        if (maxLength < 2) {
            return new int[]{input[0]};
        }

        return Arrays.copyOfRange(input, start, end + 1);
    }
}
