package com.phamhieu.exercise.basic.number;

public class Sohoc03 {

    public String findTheProductOfPrimeFactors(final int input) {
        int number = input;
        if (number == 0 || number == 1) {
            return "0";
        }
        if (number < 0) {
            return "- " + findTheProductOfPrimeFactors(-number);
        }

        final StringBuilder arrayPrime = new StringBuilder();
        int i = 2;
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
        for (int i = 2; i <= (int) Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
