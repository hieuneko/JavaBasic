package com.phamhieu.exercise.basic.string;

public class String10 {
    public String removeUnneededSpace(final String input) {
        final StringBuilder tempString = new StringBuilder();
        for (int k = 0; k < input.length() - 1; k++) {
            if (input.charAt(k) == ' ' && input.charAt(k + 1) == ' ') {
                continue;
            }
            tempString.append(input.charAt(k));
        }
        tempString.append(input.charAt(input.length() - 1));
        return tempString.toString().trim();
    }
}
