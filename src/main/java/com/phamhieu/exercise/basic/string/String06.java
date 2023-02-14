package com.phamhieu.exercise.basic.string;

public class String06 {
    public int calculateEAN13CheckDigit(final String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int temp = input.charAt(i) - '0';
            if (i % 2 == 1) {
                sum += 3 * temp;
            } else {
                sum += temp;
            }
        }
        return (10 - (sum % 10)) % 10;
    }
}
