package com.phamhieu.exercise.basic.array;

public class Array06 {

    //Viết chương trình sử dụng phương pháp tìm kiếm nhị phân để tìm kiếm
    // một số nguyên từ một mảng số nguyên đã sắp xếp (tăng dần hoặc giảm dần),
    // trả về vị trí nếu tìm thấy hoặc -1 nếu không tìm thấy
    //Tìm kiếm cho mảng tăng dần
    public int findLocationNumber(final int[] input, int number) {
        int right = input.length - 1;
        int left = 0;
        while (right >= left) {
            final int mid = left + (right - left) / 2;
            if (input[mid] == number) {
                return mid;
            }
            if (input[mid] > number) {
                right = mid - 1;
            }
            if (input[mid] < number) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
