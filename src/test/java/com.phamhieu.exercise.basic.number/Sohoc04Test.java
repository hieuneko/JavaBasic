package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc04Test {

    @Test
    void findTotalOfArrayFibonaci() {
        final var test = new Sohoc04();

        assertEquals(0, test.findTotalOfArrayFibonaci(-2));
        assertEquals(0, test.findTotalOfArrayFibonaci(0));
        assertEquals(12, test.findTotalOfArrayFibonaci(8));
    }
}