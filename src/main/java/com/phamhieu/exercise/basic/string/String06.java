package com.phamhieu.exercise.basic.string;

public class String06 {

    //Một Barcode EAN 13 có 13 số như trên thì con số đầu tiên bên phải
    // qua là số verify. Viết chương trình nhận vào chuỗi số gồm 12 chữ số.
    // Trả về kết quả là chữ số verify để có thể tạo thành một barcode gồm 13 số hợp lệ.
    public int calculateEAN13CheckDigit(final String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(input.charAt(i)));
            if ((i + 1) % 2 == 0) {
                sum += 3 * temp;
            } else {
                sum += temp;
            }
        }
        int verifyNumber = 0;
        for (int i = 0; i < 10; i++) {
            if ((sum + i) % 10 == 0) {
                verifyNumber = i;
            }
        }
        return verifyNumber;
    }
}
