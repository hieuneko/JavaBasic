package com.phamhieu.exercise.basic.array;

public class Array03 {

    public int[] sortArrayBySumDigit(final int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (getSumDigits(input[i]) > getSumDigits(input[j])) {
                    int temp;
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
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
