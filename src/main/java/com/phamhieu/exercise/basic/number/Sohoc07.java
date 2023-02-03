package com.phamhieu.exercise.basic.number;

public class Sohoc07 {

    //ìm những số nguyên n có m chữ số thỏa mãn điều kiện: tổng của các chữ số của
    // n khi lũy thừa hệ số m thì đúng bằng n. Ví dụ n=153 là hợp lệ vì m=3
    // , 1^3 + 5^3 + 3^3 = 153 (Giới hạn 2<=m<=5).
    // A hoa noi chi can kiem tra 1 so nhap vao thoa hay khong nen em chi viet ham check cho so nhap vao
    public boolean checkArmstrongNumber(final int input) {
        int digits = getDigits(input);
        if (digits < 2 || digits > 5) {
            return false;
        }

        int sum = 0;
        int temp = input;
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp = temp / 10;
        }
        return input == sum;
    }

    private static int getDigits(int number) {
        return number > 9 ? 1 + getDigits(number / 10) : 1;
    }
}
