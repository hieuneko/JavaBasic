package com.phamhieu.exercise.basic.array;

public class Array07 {

    //Viết chương trình chèn một số nguyên x vào một mảng số nguyên đã sắp
    // xếp theo thứ tự tăng dần mà vẫn đảm bảo mảng kết quả tăng dần
    // (yêu cầu không thực hiện thao tác sắp xếp trong hàm)
    public int[] insertNumberToArray(final int[] input, final int number) {
        int[] result = new int[input.length + 1];
        int j = 0;
        int position = getNumberPosition(input, number);
        for (int i = 0; i < result.length; i++) {
            if (i == position) {
                result[i] = number;
            } else {
                result[i] = input[j];
                j++;
            }
        }
        return result;
    }

    private static int getNumberPosition(final int[] input, final int number) {
        if (input.length == 0) {
            return 0;
        }

        if (input[input.length - 1] < number) {
            return input.length;
        }

        int position = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] >= number && input[i - 1] <= number) {
                position = i;
            }
        }
        return position;
    }
}
