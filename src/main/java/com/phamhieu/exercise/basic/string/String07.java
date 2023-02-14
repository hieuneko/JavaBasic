package com.phamhieu.exercise.basic.string;

public class String07 {

    public int findIndexContainString(final String input, final String subString) {
        for (int i = 0; i <= input.length() - subString.length(); i++) {
            int j = 0;
            while (j < subString.length() && input.charAt(i + j) == subString.charAt(j)) {
                j++;
            }
            if (j == subString.length()) {
                return i;
            }
        }
        return -1;
    }
}

