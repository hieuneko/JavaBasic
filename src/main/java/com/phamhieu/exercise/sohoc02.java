package com.phamhieu.exercise;

public class sohoc02 {

    public int findTotalDigitsOfNumber(final int n) {
        int total = 0, soDu;
        int temp;
        temp = n;
        while (temp > 0) {
            soDu = temp % 10;
            temp = temp / 10;
            total += soDu;
        }
        return total;
    }
}
