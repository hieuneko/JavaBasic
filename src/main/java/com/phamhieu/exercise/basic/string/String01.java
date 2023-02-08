package com.phamhieu.exercise.basic.string;

public class String01 {

    //Tạo một chuỗi string bằng cách đảo ngược các ký tự từ 1 string cho trước
    public String findReverseString(final String input) {
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        return new String(result);
    }
}
