package com.phamhieu.exercise.basic.string;

public class String09 {
    public String formatCharInString(final String input) {
        final StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i == 0 || input.charAt(i - 1) == 32) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    ch = Character.toUpperCase(input.charAt(i));
                }
            } else {
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    ch = Character.toLowerCase(input.charAt(i));
                }
            }
            tempString.append(ch);
        }
        return tempString.toString();
    }
}
