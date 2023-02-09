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

        int numberSub = input.length() / lenSubString;
        String[] allSubStrings = new String[numberSub];
        int i = 0;
        int j = 0;
        while (i < input.length()) {
            allSubStrings[j] = input.substring(i, i + lenSubString);
            i += lenSubString;
            j++;
        }
        String sub = input.substring(0, lenSubString);
        for (String k : allSubStrings) {
            if (!k.equals(sub)) {
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
