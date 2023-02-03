package com.phamhieu.exercise.basic.number;

public class Sohoc03 {

    public String findTheProductOfPrimeFactors(final int input) {
        int number = input;
        int i = 2;
        final StringBuilder arrayPrime = new StringBuilder();
        if (number == 0 || number == 1) {
            return "0";
        }
        if (number < 0) {
            return "- " + findTheProductOfPrimeFactors(-number);
        }
        while (number > 1) {
            if (checkPrime(i)) {
                if (number % i == 0) {
                    arrayPrime.append(i).append(" * ");
                    number /= i;
                } else
                    i++;
            } else
                i++;
        }
        return arrayPrime.substring(0, arrayPrime.length() - 2).trim();
    }

    public boolean checkPrime(final int input) {
        if (input < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
