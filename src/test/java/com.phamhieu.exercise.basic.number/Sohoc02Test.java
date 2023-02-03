package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc02Test {

    @Test
    void findTotalOfNumber() {
        final var test = new Sohoc02();

        assertEquals(0, test.findTotalOfNumber(-2));
        assertEquals(0, test.findTotalOfNumber(0));
        assertEquals(10, test.findTotalOfNumber(1234));
    }
}