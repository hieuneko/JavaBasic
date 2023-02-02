package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc01Test {

    @Test
    void findGCD() {
        final var Exercise01 = new Sohoc01();

        assertEquals(8, Exercise01.findGCD(8, 0));
        assertEquals(4, Exercise01.findGCD(12, 8));
    }

    @Test
    void findLCM() {
        final var Exercise01 = new Sohoc01();

        assertEquals(0, Exercise01.findLCM(8, 0));
        assertEquals(204, Exercise01.findLCM(12, 34));
    }
}