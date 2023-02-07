package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Sohoc09Test {

    @Test
    void findSquareRoot() {
        final var test = new Sohoc09();
        assertEquals(0, test.findSquareRoot(0, 6));
        assertEquals(25.000000, test.findSquareRoot(625, 6));
        assertEquals(3.464101, test.findSquareRoot(12, 6));
    }
}