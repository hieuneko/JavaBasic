package com.phamhieu.exercise.basic.string;

import java.util.HashSet;
import java.util.Set;

public class String07 {

    //Implement hàm tìm kiếm một chuỗi string trong một chuỗi string khác
    public boolean checkContainString(final String input, final String subString) {
        Set<String> allSubStrings = new HashSet<>();
        boolean check = false;
        int length = subString.length();
        for (int i = 0; i < input.length(); ++i) {
            if (i + length <= input.length()) {
                String sub = input.substring(i, i + length);
                allSubStrings.add(sub);
            }
        }
        for (String i : allSubStrings) {
            if (i.equals(subString)) {
                check = true;
                break;
            }
        }
        return check;
    }
}
