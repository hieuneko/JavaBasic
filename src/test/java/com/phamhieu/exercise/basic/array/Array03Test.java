package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Array03Test {

    @Test
    void sortArrayByDigit() {
        final var test = new Array03();
        assertArrayEquals(new int[]{1, 23, 45, 100}, test.sortArrayByDigit(new int[]{23, 45, 1, 100}));
    }
}