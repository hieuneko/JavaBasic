package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc02Test {

    @Test
    void findTotalOfNumber() {
        final var Exercise02 = new Sohoc02();

        assertEquals(0, Exercise02.findTotalOfNumber(0));
        assertEquals(10, Exercise02.findTotalOfNumber(1234));
    }
}