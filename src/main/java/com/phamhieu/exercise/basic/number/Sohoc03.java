package com.phamhieu.exercise.basic.number;

public class Sohoc03 {

    public String findTheProductOfPrimeFactors(final int x){
        int n = x, i = 2;
        final StringBuilder arrayPrime = new StringBuilder();
        if(n == 0 || n == 1){
            return "0";
        }
        if(n < 0){
            return "- " + findTheProductOfPrimeFactors(-n);
        }
        while(n > 1){
            if(checkPrime(i)){
                if(n % i == 0){
                    arrayPrime.append(i).append(" * ");
                    n /= i;
                }
                else
                    i++;
            }
            else
                i++;
        }
        return arrayPrime.substring(0, arrayPrime.length() - 2).trim();
    }
    public boolean checkPrime(final int x){
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
