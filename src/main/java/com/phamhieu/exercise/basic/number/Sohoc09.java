package com.phamhieu.exercise.basic.number;

public class Sohoc09 {

    //Viết chương trình tính căn bậc 2 của một số thực không âm bất kỳ bằng phương pháp chia đôi.
    private static final double ACCURACY = 0.0001;

    public double findSquareRoot(final double input) {
        if (input < 1 && input > 0) {
            return findSquareRoot(input * 100) / 10;
        }

        double start = 0;
        double end = input;
        while (end - start >= ACCURACY) {
            final double mid = (start + end) / 2;
            if (mid * mid < input) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
