package com.phamhieu.exercise.basic.number;

public class Sohoc09 {

    //Viết chương trình tính căn bậc 2 của một số thực không âm bất kỳ bằng phương pháp chia đôi.
    public double findSquareRoot(final double input, int precision) {
        double start = 0;
        double end = input;
        double mid;
        double answer = 0.0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == input) {
                answer = mid;
                break;
            }
            if (mid * mid < input) {
                start = mid + 1;
                answer = mid;
            } else {
                end = mid - 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (answer * answer <= input) {
                answer += increment;
            }
            answer = answer - increment;
            increment = increment / 10;
        }
        return Math.round(answer * Math.pow(10, precision)) / (Math.pow(10, precision));
    }
}
