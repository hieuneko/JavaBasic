package com.phamhieu.exercise.basic.number;

public class Sohoc07 {

    //ìm những số nguyên n có m chữ số thỏa mãn điều kiện: tổng của các chữ số của
    // n khi lũy thừa hệ số m thì đúng bằng n. Ví dụ n=153 là hợp lệ vì m=3
    // , 1^3 + 5^3 + 3^3 = 153 (Giới hạn 2<=m<=5).
    // A hoa noi chi can kiem tra 1 so nhap vao thoa hay khong nen em chi viet ham check cho so nhap vao
    public boolean checkArmstrongNumber(final int input) {
        int temp = input;
        int digits = 0;
        int last;
        int sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        if(digits < 2 || digits > 5){
            return false;
        }

        temp = input;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        return input == sum;
    }
}
