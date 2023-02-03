package com.phamhieu.exercise.basic.number;

public class Sohoc09 {

    //Viết chương trình tính căn bậc 2 của một số thực không âm bất kỳ bằng phương pháp chia đôi.
    public double findSquareRoot(final double input) {
        double temp;
        double squareRoot = input / 2;
        if (input == 0) {
            return 0;
        }

        do {
            temp = squareRoot;
            squareRoot = (temp + (input / temp)) / 2;
        }
        while ((temp - squareRoot) != 0);
        return Math.round(squareRoot * 1000000.0) / 1000000.0;
    }
}
