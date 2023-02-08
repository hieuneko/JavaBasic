package com.phamhieu.exercise.basic.string;

public class String03 {
    public int findSumNumberInString(final String input) {
        if (input.equals("")) {
            return 0;
        }

        int sum = 0;
        int number = 0;
        String numberAtPosition = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                numberAtPosition += input.charAt(i);
                number = Integer.parseInt(numberAtPosition);
            } else {
                if (!numberAtPosition.equals("")) {
                    sum += number;
                    numberAtPosition = "";
                }
            }
        }
        return sum + number;
    }
}
