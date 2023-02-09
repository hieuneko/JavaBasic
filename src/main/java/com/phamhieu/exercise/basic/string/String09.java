package com.phamhieu.exercise.basic.string;

public class String09 {

    //Viết chương trình để format các ký tự trong chuỗi sao cho
    // các ký tự đầu mỗi từ luôn là viết hoa, các ký tự không phải đầu từ luôn phải viết thường
    public String formatCharInString(final String input) {
        char[] arrayInput = input.toCharArray();
        for (int i = 0; i < arrayInput.length; i++) {
            if (i == 0 || arrayInput[i - 1] == 32) {
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
