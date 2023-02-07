package com.phamhieu.exercise.basic.array;

public class Array09 {

    //Viết chương trình đếm số lượng số nguyên tố trong mảng
    public int countNumberPrime(final int[] input) {
        if (input.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i : input) {
            if (checkPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean checkPrime(final int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
