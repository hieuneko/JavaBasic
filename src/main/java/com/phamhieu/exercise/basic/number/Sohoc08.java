package com.phamhieu.exercise.basic.number;

public class Sohoc08 {

    //Số 23 khi viết nhị phân sẽ là 10111 khi viết ngược lại thành 11101 và nó
    // thành số 29. Nhập số nguyên n và tìm số m bằng cách viết ngược thứ tự số binary như trên.
    public int findNumberFromConvert(final int input) {
        int number = input;
        int outputNumber = 0;
        int[] binary = new int[1000];
        int index = 0;
        while (number > 0) {
            binary[index++] = number % 2;
            number = number / 2;
        }
        for (int i = 0; i < index; i++) {
            int len = index - 1;
            outputNumber += binary[i] * Math.pow(2, len - i);
        }
        return outputNumber;
    }
}
