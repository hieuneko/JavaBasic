package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array09Test {

    @Test
    void countNumberPrime() {
        final var test = new Array09();
        assertEquals(0, test.countNumberPrime(new int[]{}));
        assertEquals(4, test.countNumberPrime(new int[]{1, 2, 4, 7, 251, 11}));
    }
}