package com.phamhieu.exercise.basic.string;

public class String10 {
    public String removeUnneededSpace(final String input) {
        final StringBuilder tempString = new StringBuilder();
        for (int k = 0; k < input.length() - 1; k++) {
            if (!(input.charAt(k) == ' ' && input.charAt(k + 1) == ' ')) {
                tempString.append(input.charAt(k));
            }
        }
        return tempString.toString().trim();
    }
}
