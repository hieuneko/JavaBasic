package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array06Test {

    @Test
    void findLocationNumber() {
        final var test = new Array06();
        assertEquals(3, test.findLocationNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4));
        assertEquals(-1, test.findLocationNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }
}