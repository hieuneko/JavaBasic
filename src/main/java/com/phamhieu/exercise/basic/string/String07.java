package com.phamhieu.exercise.basic.string;

public class String07 {

    //Implement hàm tìm kiếm một chuỗi string trong một chuỗi string khác
    public boolean checkContainString(final String input, final String containString) {
        boolean check = false;
        for (int i = 0; i < input.length() - containString.length(); i++) {
            for (int j = 0; j < containString.length(); j++) {
                if (input.charAt(i + j) == containString.charAt(j)) {
                    check = true;
                }
            }
            if (check) {
                break;
            }
        }
        return check;
    }
}
