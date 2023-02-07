package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Array07Test {

    @Test
    void insertNumberToArray() {
        final var test = new Array07();
        assertArrayEquals(new int[]{1, 2, 3, 5, 6}, test.insertNumberToArray(new int[]{1, 2, 5, 6}, 3));
        assertArrayEquals(new int[]{4, 5, 5, 14, 16}, test.insertNumberToArray(new int[]{4, 5, 14, 16}, 5));
        assertArrayEquals(new int[]{1}, test.insertNumberToArray(new int[]{}, 1));
    }
}