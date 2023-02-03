package com.phamhieu.exercise.basic.number;

import java.util.ArrayList;

public class Sohoc04 {

    public int findTotalOfArrayFibonaci(final int x) {
        int total = 0;
        ArrayList<Integer> arrayFibonaci = new ArrayList<>();
        arrayFibonaci.add(1);
        arrayFibonaci.add(1);
        if (x <= 0) {
            return 0;
        }

        if (x == 1) {
            return 1;
        }

        while (arrayFibonaci.get(arrayFibonaci.size() - 1) < x) {
            int len = arrayFibonaci.size();
            arrayFibonaci.add(arrayFibonaci.get(len - 1) + arrayFibonaci.get(len - 2));
        }
        arrayFibonaci.remove(arrayFibonaci.size() - 1);
        for(int num : arrayFibonaci) {
            total = total + num;
        }
        return total;
    }
}
