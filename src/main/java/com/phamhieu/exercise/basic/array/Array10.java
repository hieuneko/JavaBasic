package com.phamhieu.exercise.basic.array;

public class Array10 {

    //Viết chương trình tạo một mảng số nguyên
    // bằng cách đảo ngược các phần tử trong 1 mảng số nguyên cho trước
    public int[] createReverseNumberArray(final int[] input) {
        int[] resultArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            resultArray[i] = getReverseNumber(input[i]);
        }
        return resultArray;
    }

    private int getReverseNumber(final int input) {
        int number = input;
        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }
        return result;
    }
}
