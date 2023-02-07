package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Array04Test {

    @Test
    void findLongestArray() {
        final var test = new Array04();
        assertArrayEquals(new int[]{1, 2, 3, 4}, test.findLongestArray(new int[]{5, 1, 2, 3, 4, 9}));
        assertArrayEquals(new int[]{5}, test.findLongestArray(new int[]{5, 1, 4, 3, 6, 9}));
    }
}