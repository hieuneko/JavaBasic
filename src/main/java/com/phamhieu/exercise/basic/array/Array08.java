package com.phamhieu.exercise.basic.array;

public class Array08 {

    //Viết chương trình tính tổng các bình phương của các phần tử
    public int findSumSquaresArray(final int[] input) {
        if (input.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i : input) {
            sum += i * i;
        }
        return sum;
    }
}
