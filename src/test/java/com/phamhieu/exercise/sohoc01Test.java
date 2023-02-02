package com.phamhieu.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sohoc01Test {

    @Test
    void findGCD() {
        final var test = new sohoc01();

        assertEquals(2, test.findGCD(2, 0));
        assertEquals(2, test.findGCD(12, 34));
    }

    @Test
    void findLCM() {
        final var test = new sohoc01();

        assertEquals(0, test.findLCM(5, 0));
        assertEquals(204, test.findLCM(12, 34));
    }
}