package com.phamhieu.exercise.basic.string;

public class String09 {
    public String formatCharInString(final String input) {
        final StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i == 0 || Character.isWhitespace(input.charAt(i - 1))) {
                if (Character.isLowerCase(input.charAt(i))) {
                    ch = Character.toUpperCase(input.charAt(i));
                }
            } else {
                if (Character.isUpperCase(input.charAt(i))) {
                    ch = Character.toLowerCase(input.charAt(i));
                }
            }
            tempString.append(ch);
        }
        return tempString.toString();
    }
}
