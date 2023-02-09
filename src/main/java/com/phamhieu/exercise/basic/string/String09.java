package com.phamhieu.exercise.basic.string;

public class String09 {

    //Viết chương trình để format các ký tự trong chuỗi sao cho
    // các ký tự đầu mỗi từ luôn là viết hoa, các ký tự không phải đầu từ luôn phải viết thường
    public String formatCharInString(final String input) {
        char[] arrayInput = input.toCharArray();
        if (arrayInput[0] >= 97 && arrayInput[0] <= 122) {
            arrayInput[0] -= 32;
        }

        for (int i = 1; i < arrayInput.length; i++) {
            if (arrayInput[i - 1] == 32) {
                if (arrayInput[i] >= 97 && arrayInput[i] <= 122) {
                    arrayInput[i] -= 32;
                }
            } else {
                if (arrayInput[i] >= 65 && arrayInput[i] <= 90) {
                    arrayInput[i] += 32;
                }
            }
        }
        return String.valueOf(arrayInput);
    }
}
