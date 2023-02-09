package com.phamhieu.exercise.basic.string;

public class String10 {
    public String removeUnneededSpace(final String input) {
        int start, end;
        for (start = 0; start < input.length() && Character.isWhitespace(input.charAt(start)); start++) ;
        for (end = input.length() - 1; end > start && Character.isWhitespace(input.charAt(end)); end--) ;
        char[] arrayInput = input.substring(start, end + 1).toCharArray();
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
