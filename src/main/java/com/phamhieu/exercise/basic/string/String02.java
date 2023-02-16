package com.phamhieu.exercise.basic.string;

public class String02 {

    public boolean checkSymmetryString(final String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
