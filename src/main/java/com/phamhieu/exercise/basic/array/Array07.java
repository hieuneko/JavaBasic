package com.phamhieu.exercise.basic.array;

public class Array07 {

    //Viết chương trình chèn một số nguyên x vào một mảng số nguyên đã sắp
    // xếp theo thứ tự tăng dần mà vẫn đảm bảo mảng kết quả tăng dần
    // (yêu cầu không thực hiện thao tác sắp xếp trong hàm)
    public int[] insertNumberToArray(final int[] input, final int number) {
        if (input.length == 0) {
            return new int[]{number};
        }

        int[] result = new int[input.length + 1];
        result[0] = Math.min(number, input[0]);
        int length = result.length;
        if (number >= input[input.length - 1]) {
            result[input.length] = number;
            length = length - 1;
        }
        int j = 1;
        boolean check = false;
        for (int i = 1; i < length; i++) {
            if (input[j] >= number && input[j - 1] <= number && !check) {
                result[i] = number;
                check = true;
                i++;
            }
            result[i] = input[j];
            j++;

        }
        return result;
    }
}
