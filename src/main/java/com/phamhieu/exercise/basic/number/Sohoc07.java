package com.phamhieu.exercise.basic.number;

public class Sohoc07 {
    
    public boolean checkArmstrongNumber(final int input) {
        int digits = getDigits(input);
        if (digits < 2 || digits > 5) {
            return false;
        }

        int sum = 0;
        int temp = input;
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp = temp / 10;
        }
        return input == sum;
    }

    private static int getDigits(int number) {
        return number > 9 ? 1 + getDigits(number / 10) : 1;
    }
}
