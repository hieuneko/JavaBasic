package com.phamhieu.exercise.basic.array;

public class Array06 {

    public int findLocationNumber(final int[] input, final int number) {
        int right = input.length - 1;
        int left = 0;
        while (right >= left) {
            final int mid = left + (right - left) / 2;
            if (input[mid] == number) {
                return mid;
            }
            if (input[mid] > number) {
                right = mid - 1;
            }
            if (input[mid] < number) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
