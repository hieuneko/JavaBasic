package com.phamhieu.exercise.basic.string;

public class String02 {

    //Kiểm tra chuỗi ký tự có đối xứng hay không. (Ví dụ abcdcba là đối xứng)
    public boolean checkSymmetryString(final String input) {
        for (int i = input.length() - 1; i >= input.length() / 2; i--) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
