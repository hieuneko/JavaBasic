package com.phamhieu.exercise.basic.string;

public class String04 {
    public boolean checkDuplicateString(final String input) {
        for (int i = 0; i < input.length() - 2; i++) {
            for (int j = i + 2; j < input.length() - 1; j++) {
                if (input.charAt(i) == input.charAt(j) && input.charAt(i + 1) == input.charAt(j + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
