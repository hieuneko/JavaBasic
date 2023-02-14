package com.phamhieu.exercise.basic.string;

public class String07 {

    public int checkContainString(final String input, final String subString) {
        if (input.length() < subString.length()) {
            return -1;
        }

        return findIndex(input, subString);
    }

    private int findIndex(final String input, final String subString) {
        for (int i = 0; i <= input.length() - subString.length(); i++) {
            int j;
            for (j = 0; j < subString.length(); j++) {
                if (input.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subString.length()) {
                return i;
            }
        }
        return -1;
    }
}

