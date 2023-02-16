package com.phamhieu.exercise.basic.array;

import java.util.Arrays;

public class Array03 {

    public int[] sortArrayBySumDigit(final int[] input) {
        int[] arrayNumber = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (getSumDigits(arrayNumber[i]) > getSumDigits(arrayNumber[j])) {
                    arrayNumber[i] = arrayNumber[i] + arrayNumber[j];
                    arrayNumber[j] = arrayNumber[i] - arrayNumber[j];
                    arrayNumber[i] = arrayNumber[i] - arrayNumber[j];
                }
            }
        }
        return arrayNumber;
    }

    private static int getSumDigits(int number) {
        int total = 0;
        do {
            total = total + number % 10;
            number = number / 10;
        } while (number > 0);
        return total;
    }
}
