package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Array10Test {

    @Test
    void createReverseNumberArray() {
        final var test = new Array10();
        assertArrayEquals(new int[]{}, test.createReverseNumberArray(new int[]{}));
        assertArrayEquals(new int[]{0, 12, 4, 2345, -1234}, test.createReverseNumberArray(new int[]{0, 21, 4, 5432, -4321}));
    }
}