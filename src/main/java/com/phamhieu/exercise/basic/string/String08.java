package com.phamhieu.exercise.basic.string;

public class String08 {

    //Một chuỗi các dấu ngoặc được coi là hợp lệ nếu mỗi ký tự mở ngoặc
    // luôn được đóng ngoặc bởi 1 ký tự đóng ngoặc viết sau nó và dấu đóng
    // ngoặc phải đóng 1 dấu mở ngoặc nào đó. Ví dụ
    //()()() --> Hợp lệ
    //(()), (((())))()() --> Hợp lệ, các cặp dấu ngoặc có thể lồng nhau
    //( --> Không hợp lệ, dấu mở ngoặc không được đóng
    //) --> Không hợp lệ, dấu đóng ngoặc phải đóng 1 dấu mở ngoặc
    //()(, )() --> Không hợp lệ
    public boolean checkParentheses(final String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}
