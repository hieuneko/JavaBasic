package com.phamhieu.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array02Test {

    @Test
    void findTotalInArray() {
        final var test = new Array02();
        assertEquals(3, test.findTotalInArray(new int[]{2, 4, 6, 1, 3, 5}));
    }
}