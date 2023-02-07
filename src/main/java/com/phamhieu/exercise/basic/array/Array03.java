package com.phamhieu.exercise.basic.array;

public class Array03 {

    public int[] sortArrayByDigit(final int[] input) {
        int[] digitsArray = addTotalDigistToArray(input, input.length);
        int temp;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (digitsArray[i] > digitsArray[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    private static int[] addTotalDigistToArray(final int[] input, int len) {
        int[] digitsArray = new int[len];
        for (int i = 0; i < input.length; i++) {
            digitsArray[i] = getDigits(input[i]);
        }
        return digitsArray;
    }

    private static int getDigits(int number) {
        return number > 9 ? 1 + getDigits(number / 10) : 1;
    }
}
