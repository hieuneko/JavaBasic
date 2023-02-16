package com.phamhieu.exercise.basic.string;

public class String07 {

    public int findIndexContainString(final String input, final String subString) {
        for (int i = 0; i < input.length(); i++) {
            if (isStringFoundAt(input, subString, i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isStringFoundAt(final String input, final String subString, final int index) {
        if (index + subString.length() > input.length()) {
            return false;
        }

        for (int i = 0; i < subString.length(); i++) {
            if (input.charAt(index + i) != subString.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

