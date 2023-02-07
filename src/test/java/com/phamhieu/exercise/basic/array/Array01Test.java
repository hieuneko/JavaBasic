package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array01Test {

    @Test
    void findMaxNumberArray() {
        final var test = new Array01();
        assertEquals(9, test.findMaxNumberArray(new int[]{2, 5, 1, 9, 7}));
    }
}