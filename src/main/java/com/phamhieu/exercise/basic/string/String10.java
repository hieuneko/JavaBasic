package com.phamhieu.exercise.basic.string;

public class String10 {
    public String removeUnneededSpace(final String input) {
        int i = 0;
        while (i < input.length() && Character.isWhitespace(input.charAt(i))) {
            i++;
        }
        int j = input.length() - 1;
        while (j >= 0 && Character.isWhitespace(input.charAt(j))) {
            j--;
        }
        if (i >= j) {
            return "";
        }

        char[] arrayInput = input.substring(i, j + 1).toCharArray();
        String tempString = "";
        for (int k = 0; k < arrayInput.length - 1; k++) {
            if (arrayInput[k] == ' ' && arrayInput[k + 1] == ' ') {
                continue;
            }
            tempString += String.valueOf(arrayInput[k]);
        }
        tempString += String.valueOf(arrayInput[arrayInput.length - 1]);
        return tempString;
    }
}
