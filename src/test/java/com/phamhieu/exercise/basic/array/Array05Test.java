package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array05Test {

    @Test
    void findSubOfTwoNumber() {
        final var test = new Array05();
        assertEquals(11, test.findSubOfTwoNumber(new int[]{1, 3, -4, 2, 7}));
    }
}