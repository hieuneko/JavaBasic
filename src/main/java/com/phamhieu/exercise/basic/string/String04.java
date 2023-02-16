package com.phamhieu.exercise.basic.string;

public class String04 {
    public boolean checkDuplicateString(final String input) {
        if (input.length() == 0) {
            return false;
        }

        int lenSubString = countLenghtSubString(input);
        if (input.length() % lenSubString != 0) {
            return false;
        }

        final String sub = input.substring(0, lenSubString);
        for (int i = lenSubString; i < input.length(); i += lenSubString) {
            String temp = input.substring(i, i + lenSubString);
            if (!temp.equals(sub)) {
                return false;
            }
        }
        return true;
    }

    private static int countLenghtSubString(final String input) {
        int count = 1;
        int i = 1;
        while (i < input.length() - 1 && input.charAt(i) != input.charAt(0)) {
            count++;
            i++;
        }
        return count;
    }
}
