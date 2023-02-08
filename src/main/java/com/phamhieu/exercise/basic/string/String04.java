package com.phamhieu.exercise.basic.string;

public class String04 {
    public boolean checkDuplicateString(final String input) {
        if (input.length() == 0) {
            return false;
        }

        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length() - 1; j++) {
                if (input.charAt(i) == input.charAt(j) && input.charAt(i + 1) == input.charAt(j + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
