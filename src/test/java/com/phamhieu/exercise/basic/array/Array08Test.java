package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array08Test {

    @Test
    void findSumSquaresArray() {
        final var test = new Array08();
        assertEquals(0, test.findSumSquaresArray(new int[]{}));
        assertEquals(10001, test.findSumSquaresArray(new int[]{4, 6, 2, 12, 99}));
    }
}