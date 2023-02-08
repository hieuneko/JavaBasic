package com.phamhieu.exercise.basic.string;

public class String05 {

    //Một Barcode EAN 13 có 13 con số được coi là hợp lệ nếu:
    // tổng của các số ở vị trí lẻ + 3*(tổng các số ở vị trí chẳn) là một số chia hết cho 10.
    //Ví dụ mã barcode 8938505974194 ta có (8+3+5+5+7+1+4) + 3 * (9+8+0+9+4+9) = 150.
    // 150 chia hết cho 10 nên mã 8938505974194 là hợp lệ.
    //Viết chương trình kiểm tra tính hợp lệ của một barcode.
    public boolean checkBarcodeEan13(final String input) {
        int sumInEven = 0;
        int sumInOdd = 0;
        for (int i = 0; i < input.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(input.charAt(i)));
            if ((i + 1) % 2 == 0) {
                sumInEven += temp;
            } else {
                sumInOdd += temp;
            }
        }
        return (sumInOdd + 3 * sumInEven) % 10 == 2;
    }
}
