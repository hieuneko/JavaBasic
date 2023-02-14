package com.phamhieu.exercise.basic.string;

public class String03 {
    public int findSumNumberInString(final String input) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                number = number * 10 + input.charAt(i) - '0';
            } else {
                sum += number;
                number = 0;
            }
        }
        return sum + number;
    }
}
