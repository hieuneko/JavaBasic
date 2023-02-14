package com.phamhieu.exercise.basic.array;

public class Array07 {

    public int[] insertNumberToArray(final int[] input, final int number) {
        int[] result = new int[input.length + 1];
        final int index = findIndexOfNumber(input, number);
        for (int i = 0; i < index; i++) {
            result[i] = input[i];
        }
        result[index] = number;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = input[i - 1];
        }
        return result;
    }

    private int findIndexOfNumber(final int[] input, final int number) {
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            final int mid = left + (right - left) / 2;

            if (input[mid] == number) {
                return mid;
            }

            if (input[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
