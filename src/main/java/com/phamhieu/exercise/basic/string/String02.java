package com.phamhieu.exercise.basic.string;

public class String02 {

    //Kiểm tra chuỗi ký tự có đối xứng hay không. (Ví dụ abcdcba là đối xứng)
    public boolean checkSymmetryString(final String input) {
        if (input.equals("")) {
            return false;
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString.append(input.charAt(i));
        }
        return input.equals(reverseString.toString());
    }
}
