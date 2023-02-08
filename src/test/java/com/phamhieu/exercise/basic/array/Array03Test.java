package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Array03Test {

    @Test
    void sortArrayByDigit() {
        final var test = new Array03();
        assertArrayEquals(new int[]{}, test.sortArrayBySumDigit(new int[]{}));
        assertArrayEquals(new int[]{1, 102, 23, 45}, test.sortArrayBySumDigit(new int[]{23, 45, 1, 102}));
    }
}