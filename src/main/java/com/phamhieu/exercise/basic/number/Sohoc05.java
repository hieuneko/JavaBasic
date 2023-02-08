package com.phamhieu.exercise.basic.number;

public class Sohoc05 {

    //Viết phương trình nhập vào n và in ra tổng của dãy số Dãy số 1*2 + 2*3 + 3*4 +...+ n*(n+1)
    public int findSum(final int input) {
        if (input <= 0) {
            return 0;
        }

        int total = 0;
        for (int i = 1; i <= input; i++) {
            total += i * (i + 1);
        }
        return total;
    }
}
