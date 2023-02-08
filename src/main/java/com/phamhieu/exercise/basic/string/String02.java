package com.phamhieu.exercise.basic.string;

public class String02 {

    //Kiểm tra chuỗi ký tự có đối xứng hay không. (Ví dụ abcdcba là đối xứng)
    public boolean checkSymmetryString(final String input) {
        boolean check = true;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                check = false;
                break;
            }
        }
        return check;
    }
}
